import java.util.concurrent.*
import br.com.seatecnologia.sesc.siged.service.*
import br.com.seatecnologia.sesc.siged.model.*
import br.com.seatecnologia.sesc.siged.background.task.*
import com.liferay.portal.kernel.service.*
import com.liferay.portal.kernel.util.*
import com.liferay.portal.kernel.exception.PortalException
import com.liferay.portal.kernel.log.Log
import com.liferay.portal.kernel.log.LogFactoryUtil
import java.util.ArrayList

class StressTestPDFGeneration {

    private static final Log _log = LogFactoryUtil.getLog(StressTestPDFGeneration.class)
    private static final int THREAD_COUNT = 2 // Número de threads para o teste de stress
    private static final int TASK_COUNT = 300 // Número de tarefas para o teste

    static void main(String[] args) {
        // List<Process> processes = ProcessLocalServiceUtil.getProcesses(0, TASK_COUNT)
        List<Process> processes = new ArrayList<Process>()
        processes.add(ProcessLocalServiceUtil.getProcess(55146))
        // List<Process> processes = ProcessLocalServiceUtil.getProcesses(0, TASK_COUNT)
        int count = 1;
        for (Process process : processes) {
            _log.info("Gerando PDF para processo: " + process.getProcessId() + " (" + count++ + "/" + TASK_COUNT + ")")
            try {
                ServiceContext serviceContext = createMockServiceContext(process)
                triggerPDFGeneration(process, serviceContext)
            } catch (PortalException e) {
                _log.error("Erro ao gerar PDF para processo: " + process.getProcessId(), e)
            }
        }
        _log.info("Teste de stress finalizado.")
    }

    static void triggerPDFGeneration(Process process, ServiceContext serviceContext) throws PortalException {

        Map<String, Serializable> taskContextMap = new HashMap<>();

        taskContextMap.put("processId", process.getProcessId());
        taskContextMap.put("serviceContext", serviceContext);
        com.liferay.portal.kernel.backgroundtask.BackgroundTaskManagerUtil.addBackgroundTask(serviceContext.getUserId(), serviceContext.getScopeGroupId(), "pdf-generation-background-task-" + process.getProcessId(),
        "br.com.seatecnologia.sesc.siged.background.task.GeneratePDFTaskExecutor", taskContextMap, serviceContext);

        _log.info("PDF gerado para processo: " + process.getProcessId())
    }

    static ServiceContext createMockServiceContext(Process process) {
        // Mock de ServiceContext
        ServiceContext serviceContext = new ServiceContext()
        serviceContext.setCompanyId(process.getCompanyId()) // Mock ID da empresa
        serviceContext.setScopeGroupId(process.getGroupId()) // Mock ID do grupo
        serviceContext.setUserId(process.getUserId()) // Mock ID do usuário
        return serviceContext
    }
}