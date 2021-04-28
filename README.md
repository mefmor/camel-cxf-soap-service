# Apache Camel and Spring WS

This example demonstrate SOAP service based on Spring Boot, Apache Camel and CXF component
This sample based on guide [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)

## How to use
Some classes doesn't include in the repository and will be generated by maven-jaxb2-plugin from WSDL  

As client for this service it is recommended to use SoapUI. Just create new project from the WSDL  
- Endpoint: http://localhost:8080/ws
- WSDL: http://localhost:8080/ws/countries.wsdl

Sample of SOAP request to the service:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://spring.io/guides/gs-producing-web-service">
<soapenv:Header/>
    <soapenv:Body>
        <gs:getCountryRequest><gs:name>Poland</gs:name></gs:getCountryRequest>
    </soapenv:Body>
</soapenv:Envelope>
```

## Resources
[Camel CXF Component](https://camel.apache.org/components/2.x/cxf-component.html)