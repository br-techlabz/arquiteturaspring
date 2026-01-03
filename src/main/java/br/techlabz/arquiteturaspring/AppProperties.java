package br.techlabz.arquiteturaspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppProperties {

    private String variavel;

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }
}
