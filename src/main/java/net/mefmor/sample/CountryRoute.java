package net.mefmor.sample;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryRoute extends RouteBuilder {
    @Autowired
    CountryProcessor countryProcessor;

    @Override
    public void configure() {
        JaxbDataFormat jaxb = new JaxbDataFormat(GetCountryRequest.class.getPackage().getName());
        
        from("cxf:bean:countryServiceEndpoint")
            .unmarshal(jaxb)
            .process(countryProcessor)
            .marshal(jaxb);
    }
   
}