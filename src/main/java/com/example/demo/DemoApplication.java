package com.example.demo;

import com.example.demo.config.VaultConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@SpringBootApplication
// @EnableDiscoveryClient
public class DemoApplication {

	private static Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		VaultConfig cf = ctx.getBean(VaultConfig.class);
		log.info("login: = "+cf.getLogin());
	}

}
