package com.saurabh.clinicalsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Clinical Service API", version = "1.0", description = "This API is for Patients"))
public class ClinicalsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalsapiApplication.class, args);
	}

}
