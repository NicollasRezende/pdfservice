/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.base;

import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.PropostaLocalService;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdministradorJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdvogadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AnexosOutrosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BemDireitoAdicionalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosLaudoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosRequerentePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ComprovanteHonorarioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ConcessaoDfPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CreditoTransacionadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CredorPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosRegistroPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DeclaracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemaisPartesPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoContabilPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DocumentoComprobatorioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EditalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EncargoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EnderecoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.FundamentacaoPedidoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.IdentificacaoDebitosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ParcelamentoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ProcuracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.PropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoCompletaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.RelacaoCredorPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.TermoAssinadoPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.CurrentConnectionUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.sql.Connection;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the proposta local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.com.seatecnologia.gdf.negocia.service.impl.PropostaLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see br.com.seatecnologia.gdf.negocia.service.impl.PropostaLocalServiceImpl
 * @generated
 */
public abstract class PropostaLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, PropostaLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PropostaLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>br.com.seatecnologia.gdf.negocia.service.PropostaLocalServiceUtil</code>.
	 */

	/**
	 * Adds the proposta to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Proposta addProposta(Proposta proposta) {
		proposta.setNew(true);

		return propostaPersistence.update(proposta);
	}

	/**
	 * Creates a new proposta with the primary key. Does not add the proposta to the database.
	 *
	 * @param propostaId the primary key for the new proposta
	 * @return the new proposta
	 */
	@Override
	@Transactional(enabled = false)
	public Proposta createProposta(long propostaId) {
		return propostaPersistence.create(propostaId);
	}

	/**
	 * Deletes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta that was removed
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Proposta deleteProposta(long propostaId) throws PortalException {
		return propostaPersistence.remove(propostaId);
	}

	/**
	 * Deletes the proposta from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Proposta deleteProposta(Proposta proposta) {
		return propostaPersistence.remove(proposta);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return propostaPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Proposta.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return propostaPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return propostaPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return propostaPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return propostaPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return propostaPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Proposta fetchProposta(long propostaId) {
		return propostaPersistence.fetchByPrimaryKey(propostaId);
	}

	/**
	 * Returns the proposta matching the UUID and group.
	 *
	 * @param uuid the proposta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proposta, or <code>null</code> if a matching proposta could not be found
	 */
	@Override
	public Proposta fetchPropostaByUuidAndGroupId(String uuid, long groupId) {
		return propostaPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the proposta with the primary key.
	 *
	 * @param propostaId the primary key of the proposta
	 * @return the proposta
	 * @throws PortalException if a proposta with the primary key could not be found
	 */
	@Override
	public Proposta getProposta(long propostaId) throws PortalException {
		return propostaPersistence.findByPrimaryKey(propostaId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(propostaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Proposta.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("propostaId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			propostaLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Proposta.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("propostaId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(propostaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Proposta.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("propostaId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Proposta>() {

				@Override
				public void performAction(Proposta proposta)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, proposta);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Proposta.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return propostaPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement PropostaLocalServiceImpl#deleteProposta(Proposta) to avoid orphaned data");
		}

		return propostaLocalService.deleteProposta((Proposta)persistedModel);
	}

	@Override
	public BasePersistence<Proposta> getBasePersistence() {
		return propostaPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return propostaPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the propostas matching the UUID and company.
	 *
	 * @param uuid the UUID of the propostas
	 * @param companyId the primary key of the company
	 * @return the matching propostas, or an empty list if no matches were found
	 */
	@Override
	public List<Proposta> getPropostasByUuidAndCompanyId(
		String uuid, long companyId) {

		return propostaPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of propostas matching the UUID and company.
	 *
	 * @param uuid the UUID of the propostas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching propostas, or an empty list if no matches were found
	 */
	@Override
	public List<Proposta> getPropostasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Proposta> orderByComparator) {

		return propostaPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the proposta matching the UUID and group.
	 *
	 * @param uuid the proposta's UUID
	 * @param groupId the primary key of the group
	 * @return the matching proposta
	 * @throws PortalException if a matching proposta could not be found
	 */
	@Override
	public Proposta getPropostaByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return propostaPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the propostas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>br.com.seatecnologia.gdf.negocia.model.impl.PropostaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of propostas
	 * @param end the upper bound of the range of propostas (not inclusive)
	 * @return the range of propostas
	 */
	@Override
	public List<Proposta> getPropostas(int start, int end) {
		return propostaPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of propostas.
	 *
	 * @return the number of propostas
	 */
	@Override
	public int getPropostasCount() {
		return propostaPersistence.countAll();
	}

	/**
	 * Updates the proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PropostaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param proposta the proposta
	 * @return the proposta that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Proposta updateProposta(Proposta proposta) {
		return propostaPersistence.update(proposta);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PropostaLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		propostaLocalService = (PropostaLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PropostaLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Proposta.class;
	}

	protected String getModelClassName() {
		return Proposta.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		DataSource dataSource = propostaPersistence.getDataSource();

		DB db = DBManagerUtil.getDB();

		Connection currentConnection = CurrentConnectionUtil.getConnection(
			dataSource);

		try {
			if (currentConnection != null) {
				db.runSQL(currentConnection, new String[] {sql});

				return;
			}

			try (Connection connection = dataSource.getConnection()) {
				db.runSQL(connection, new String[] {sql});
			}
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected AcaoJudicialPersistence acaoJudicialPersistence;

	@Reference
	protected AcaoJudicialPropostaPersistence acaoJudicialPropostaPersistence;

	@Reference
	protected AdministradorJudicialPersistence administradorJudicialPersistence;

	@Reference
	protected AdvogadoPersistence advogadoPersistence;

	@Reference
	protected AnexosOutrosPersistence anexosOutrosPersistence;

	@Reference
	protected BemDireitoAdicionalPersistence bemDireitoAdicionalPersistence;

	@Reference
	protected BensDireitosLaudoPersistence bensDireitosLaudoPersistence;

	@Reference
	protected BensDireitosRequerentePersistence
		bensDireitosRequerentePersistence;

	@Reference
	protected ComprovanteHonorarioPersistence comprovanteHonorarioPersistence;

	@Reference
	protected ConcessaoDfPersistence concessaoDfPersistence;

	@Reference
	protected CreditoTransacionadoPersistence creditoTransacionadoPersistence;

	@Reference
	protected CredorPropostaPersistence credorPropostaPersistence;

	@Reference
	protected DadosRegistroPersistence dadosRegistroPersistence;

	@Reference
	protected DeclaracaoPersistence declaracaoPersistence;

	@Reference
	protected DemaisPartesPersistence demaisPartesPersistence;

	@Reference
	protected DemonstracaoContabilPersistence demonstracaoContabilPersistence;

	@Reference
	protected DocumentoComprobatorioPersistence
		documentoComprobatorioPersistence;

	@Reference
	protected EditalPersistence editalPersistence;

	@Reference
	protected EncargoPersistence encargoPersistence;

	@Reference
	protected EnderecoPersistence enderecoPersistence;

	@Reference
	protected FundamentacaoPedidoPersistence fundamentacaoPedidoPersistence;

	@Reference
	protected GarantiaPersistence garantiaPersistence;

	@Reference
	protected GarantiaPropostaPersistence garantiaPropostaPersistence;

	@Reference
	protected IdentificacaoDebitosPersistence identificacaoDebitosPersistence;

	@Reference
	protected ParcelamentoPersistence parcelamentoPersistence;

	@Reference
	protected ProcuracaoPersistence procuracaoPersistence;

	protected PropostaLocalService propostaLocalService;

	@Reference
	protected PropostaPersistence propostaPersistence;

	@Reference
	protected QualificacaoCompletaPersistence qualificacaoCompletaPersistence;

	@Reference
	protected RelacaoCredorPersistence relacaoCredorPersistence;

	@Reference
	protected TermoAssinadoPersistence termoAssinadoPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		PropostaLocalServiceBaseImpl.class);

}