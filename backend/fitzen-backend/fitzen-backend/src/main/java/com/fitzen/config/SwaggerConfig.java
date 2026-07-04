package com.fitzen.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI fitzenAPI() {

        return new OpenAPI()

                .info(
                        new Info()
                                .title("FitZen API")
                                .version("1.0")
                                .description("Fitness Tracker Backend API")
                );
    }
}