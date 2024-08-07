package dev.diegoborba.hackathonkipper.config;

import dev.diegoborba.hackathonkipper.config.properties.ApplicationProperties;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    private final ApplicationProperties property;

    @Bean
    public OpenAPI info() {
        final var info = new Info()
                .title(property.name())
                .version(property.version())
                .description(property.description());
        return new OpenAPI().info(info);
    }
}