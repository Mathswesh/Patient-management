package com.patientmanagement.patient_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientServiceApplication implements CommandLineRunner {

	@Value("${server.port}")
	private String serverPort;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server running on port: " + serverPort);
	}
	public static void main(String[] args) {SpringApplication.run(PatientServiceApplication.class, args);
	}

}
