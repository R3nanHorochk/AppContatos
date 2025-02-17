package br.com.rha.AppContatos.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
@Configuration
public class OpenApiConfig {
@Bean
    public OpenAPI customOpenAPI() {        
        return new OpenAPI()
                .components(new Components().addSecuritySchemes("basicScheme",
                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
                .info(new Info()
                        .title("API de contatos")
                        .description("API de contatos para JP2025")
                        .contact(new Contact().name("Renan").email("renanhorochkdeandrade@gmail.com").url("https://www.linkedin.com/in/renan-horochk-de-andrade-943173329/"))
                        .version("Versão API 1"));
    }
}

