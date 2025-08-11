package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.ArquivoRequest;
import org.osgi.service.component.annotations.Component;

import java.io.InputStream;

public class ArquivoRequestMapper {

    public ArquivoRequest toRequest(String fileName, InputStream inputStream, long size, String fileType) {
            ArquivoRequest arquivoRequest = new ArquivoRequest();
            arquivoRequest.setFileName(fileName);
            arquivoRequest.setInputStream(inputStream);
            arquivoRequest.setSize(size);
            arquivoRequest.setFileType(fileType);
            return arquivoRequest;
    }
}
