package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfig {
    @Value("${login}")
    private String login;

    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login=login;
    }
}