package com.khalilsaboor.springboot.swaggerdemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * The configuration of Swagger mainly centers around the Docket bean.
     * I'm creating a swagger docket
     */
    /**
     * .apiInfo - we use this method to override the API info and added
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.khalilsaboor.springboot.swaggerdemo"))
                .paths(regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());
    }

    /**
     * Here we created an instance of ApiInfo
     * @return
     */
    private ApiInfo metaInfo() {
        return new ApiInfo(
                "My REST API",
                "Some custom description of API.",
                "API TOS",
                "Terms of service",
                new Contact("John Doe", "www.example.com", "myeaddress@company.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
