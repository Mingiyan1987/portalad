package ru.basanov.portalad.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.basanov.portalad.service.SaleService;
import ru.basanov.portalad.soap.sale.SaleReqeust;
import ru.basanov.portalad.soap.sale.SaleResponse;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.logging.Logger;

@Endpoint
public class SaleEndpoint {

    @NotNull
    private final static Logger LOGGER = Logger.getLogger(SaleEndpoint.class.getSimpleName());

    @NotNull
    public final static String LOCATION_URI = "/soap/task";

    @NotNull
    public final static String PORT_TYPE_NAME = "SaleEndpointPort";

    @NotNull
    public final static String NAMESPACE = "http://basanov.ru/spring/soap/sale";

    private SaleService saleService;

    @Autowired
    public void setSaleService(SaleService saleService) {
        this.saleService = saleService;
    }

    @PayloadRoot(localPart = "saleRequest", namespace = NAMESPACE)
    @ResponsePayload
    public SaleResponse saleResponse (@RequestPayload SaleReqeust reqeust) throws DatatypeConfigurationException {
        SaleResponse response = new SaleResponse();
        response.setName("Футбол");
        return response;
    }

}
