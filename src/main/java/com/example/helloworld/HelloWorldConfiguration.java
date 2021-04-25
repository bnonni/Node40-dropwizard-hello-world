package com.example.helloworld;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    private String template;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
