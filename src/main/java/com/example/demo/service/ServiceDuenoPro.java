package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;
import com.example.demo.repository.RepositoryDueno;

@Profile("Pro")
@Service
public class ServiceDuenoPro implements ServiceDueno{

	Logger l = org.apache.logging.log4j.LogManager.getLogger();

	@Autowired
	@Qualifier("listDueno")
	public RepositoryDueno repository;
	
	@Override
	public void guardar(Dueno dueno) {
		l.info("guardando dueno en PRODUCCION");
		repository.save(dueno);
	}

	@Override
	public List<Dueno> listaDuenos() {
		List<Dueno> listaDuenos = repository.listAllDuenos();
		return listaDuenos;
	}

	@Override
	public Dueno cogerDuenoPorDni(int dni) {
		Dueno dueno = repository.cogerDuenoPorDni(dni);
		return dueno;
	}

	@Override
	public void actualizar(Dueno dueno) {
		repository.actualizar(dueno);
	}

}
