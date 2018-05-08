package com.cws.monkeykeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages ="com.cws.monkeykeeper")
public class MonkeyKeeperApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MonkeyKeeperApplication.class);
	}
	@Bean
	protected static PropertySourcesPlaceholderConfigurer propertyConfiInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	public static void main(String[] args) {
		SpringApplication.run(MonkeyKeeperApplication.class, args);
	}
}
