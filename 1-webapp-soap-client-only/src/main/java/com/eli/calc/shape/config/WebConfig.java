package com.eli.calc.shape.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.eli.calc.shape.service.ws.impl.ShapeCalculatorWebServiceImplService;
import com.eli.calc.shape.soapclient.ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client;

@EnableWebMvc
//@Configuration
@PropertySource("classpath:web.application.properties")
@ComponentScan(basePackages="com.eli.calc.shape")
public class WebConfig extends WebMvcConfigurerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(WebConfig.class);

	@Bean
	public InternalResourceViewResolver viewResolver() {

        System.err.println("\n\n\n\nELI: Web Config @Bean ViewResolvr\n\n\n\n");

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}



	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		System.err.println("\n\n\n\nELI: Web Config addResourceHandlers\n\n\n\n");

		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client soapClient(
											@Value("${ws.wsdl.url}") String urlString) {

        URL wsdlURL = ShapeCalculatorWebServiceImplService.WSDL_LOCATION;

        if (null!=urlString && !urlString.isEmpty()) { 
            File wsdlFile = new File(urlString);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(urlString);
                }
            } catch (MalformedURLException e) {
                logger.error(e.getMessage(),e);
                throw new RuntimeException(e);
            }
        }

		return new ShapeCalculatorWebService_ShapeCalculatorWebServiceImplPort_Client(
				wsdlURL);
	}
}
