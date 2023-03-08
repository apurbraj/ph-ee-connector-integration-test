package org.mifos.integrationtest;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonInclude;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DeserializationFeature;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources")
@SpringBootApplication
public class IntegrationTestApplication {

	public static void main(String[] args) {
		String[] arguments = {"--plugin", "html:cucumber-report",
				"--plugin", "json:cucumber.json",
				"--plugin", "pretty",
				"--plugin", "html:build/cucumber-report.html",
				"--plugin", "json:build/cucumber-report.json",
				"--glue", "org.mifos.integrationtest.cucumber", "src/test/java/resources"};
		io.cucumber.core.cli.Main.run(arguments);
		SpringApplication.run(IntegrationTestApplication.class, args);

	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper
				.setSerializationInclusion(JsonInclude.Include.NON_NULL)
				.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
	@PostConstruct
	public void runIntegrationTest(){

	}

}
