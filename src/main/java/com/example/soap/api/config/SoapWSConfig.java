package com.example.soap.api.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWSConfig {

    // Bean para indicar a la configuracion el contexto que se piensa utilizar y activar la modficacion del WSDL por defecto
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();

        messageDispatcherServlet.setApplicationContext(applicationContext);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(messageDispatcherServlet, "/ws/*");
    }

    // Bean para indicar de donde se toma el esquema de XSD
    @Bean
    public XsdSchema xsdSchema() {
        return new SimpleXsdSchema(new ClassPathResource("soap-api.xsd"));
    }

    // Configuracion a tener en cuenta para la creacion del WSDL
    @Bean(name = "userWsdl")    //nombre del bean con el que se va a crear el wsdl
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema xsdSchema) {
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();

        defaultWsdl11Definition.setPortTypeName("User");    // nombre de la clase del endpoint sin la palabra "Endpoint"
        defaultWsdl11Definition.setLocationUri("/ws");      // url por donde se va a consultar el archivo wsdl
        defaultWsdl11Definition.setTargetNamespace("http://www.example.com/soap/api/metadataxsd");
        defaultWsdl11Definition.setSchema(xsdSchema);

        return defaultWsdl11Definition;
    }
}
