package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.ParcelamentoRequerenteRequest;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

@Component(
    service = ParcelamentoRequerenteRequestMapper.class
)
public class ParcelamentoRequerenteRequestMapper {

    public List<ParcelamentoRequerenteRequest> toRequest(String[] parcelamentoDias) {
        List<ParcelamentoRequerenteRequest> parcelamentoRequerenteRequestList = new ArrayList<>();

            ParcelamentoRequerenteRequest parcelamentoRequerenteRequest = new ParcelamentoRequerenteRequest();
//            if (parcelamentoDias[0].split(",").length > 1) {
//                parcelamentoRequerenteRequest.setParcelas(parcelamentoDias[0].split(",")[1]);
//            } else {
//                parcelamentoRequerenteRequest.setParcelas(parcelamentoDias[0]);
//            }
//            parcelamentoRequerenteRequestList.add(parcelamentoRequerenteRequest);

        return parcelamentoRequerenteRequestList;
    }
}
