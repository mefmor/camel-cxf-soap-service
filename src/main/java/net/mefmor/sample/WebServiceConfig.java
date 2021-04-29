package net.mefmor.sample;


import io.spring.guides.gs_producing_web_service.CountriesPort;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public CxfEndpoint countryServiceEndpoint() {

        // TODO: Change endpoint from http://localhost:8080/services/ws to http://localhost:8080/ws
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("/ws/");
        cxfEndpoint.setServiceNameString("s:country:countryService");
        cxfEndpoint.setServiceClass(CountriesPort.class);
        cxfEndpoint.setBus(bus);
        return cxfEndpoint;
    }
}