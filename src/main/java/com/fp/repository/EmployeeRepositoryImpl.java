package com.fp.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Mediante @Componente permitimos la busqueda de esta clase para realizar su inyeccion de dependencias
 */
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

	private static Logger LOG = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);

	@Override
	public void create(String name) {
		LOG.info("Usuario creado en la base de datos: " + name);
	}

}
