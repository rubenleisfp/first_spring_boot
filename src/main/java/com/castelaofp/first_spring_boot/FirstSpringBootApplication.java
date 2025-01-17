package com.castelaofp.first_spring_boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.castelaofp.first_spring_boot.repository.EmployeeRepository;


@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {


	private static Logger LOG = LoggerFactory.getLogger(FirstSpringBootApplication.class);

	/**
	 * Realizamos la inyeccion de dependencias con esto. Busca una clase EmployeeRepository y crea
	 * un nuevo objeto de ese tipo
	 */
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.debug("TRAZA A DEBUG");
		LOG.info("TRAZA A INFO");
		LOG.warn("TRAZA A WARN");
		LOG.error("TRAZA A ERROR");
		employeeRepository.create("Ruben");
	}

}
