package net.mefmor.sample;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountryRoute extends RouteBuilder {
    @Autowired
    CountryProcessor countryProcessor;

    @Override
    public void configure() {
        from("cxf:bean:countryServiceEndpoint")
            .process(countryProcessor);
    }
   
}