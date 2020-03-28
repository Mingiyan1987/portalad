package ru.basanov.portalad.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import ru.basanov.portalad.endpoint.SaleEndpoint;

import javax.servlet.ServletRegistration;
import javax.validation.constraints.NotNull;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @NotNull
    private static final String WS_MAPPING = "/soap/*";

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, WS_MAPPING);
    }

    @Bean(name = "SaleService")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema testEndpointSchema) {
        final DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName(SaleEndpoint.PORT_TYPE_NAME);
        wsdl11Definition.setLocationUri(SaleEndpoint.LOCATION_URI);
        wsdl11Definition.setTargetNamespace(SaleEndpoint.NAMESPACE);
        wsdl11Definition.setSchema(testEndpointSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema testEnpointSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/saleEndpoint.xsd"));
    }
}
