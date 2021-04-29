package net.mefmor.sample;


import io.spring.guides.gs_producing_web_service.CountriesPort;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Bean
    public CxfEndpoint countryServiceEndpoint() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("/ws/");
        cxfEndpoint.setServiceClass(CountriesPort.class);
        return cxfEndpoint;
    }
}