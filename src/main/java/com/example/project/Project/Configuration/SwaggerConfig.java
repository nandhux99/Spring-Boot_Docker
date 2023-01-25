package com.example.project.Project.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@Configuration
public class SwaggerConfig {

	@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResourcesProvider() {
		return ()  -> {
			List<SwaggerResource> resources = new ArrayList<>();
			Arrays.asList("api1", "api2").forEach(resourceName -> resources.add(loadResource(resourceName)));
			return resources;
		};
	}

	public SwaggerResource loadResource(String resource) {
		SwaggerResource wsResource = new SwaggerResource();
		wsResource.setName(resource);
		wsResource.setSwaggerVersion("2.0");
		wsResource.setLocation("/swagger-yaml/" + resource + "/swagger.yaml");
		return wsResource;
	}
	@Bean
    public Docket swagger() {

        return new Docket(SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
