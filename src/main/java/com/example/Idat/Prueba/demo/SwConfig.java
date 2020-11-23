package com.example.Idat.Prueba.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwConfig {

	//Añadi un comentario
	
	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.Idat.Prueba.demo.Controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
		//Stella was a diver and she always down:			

	}
	
	private ApiInfo apiInfo()
	{
		return new ApiInfo("Examen de servicios REST - EVC1",
							"Documentación del Examen",
							"1.1", 
							"Terminos del servicio", 
							new Contact("Yolanda Chauca", "MIT license", "corre0Prueba@gmail.com"), 
							"https://google.com ", 
							"https://google.com",
							Collections.emptyList());	
	}
}
