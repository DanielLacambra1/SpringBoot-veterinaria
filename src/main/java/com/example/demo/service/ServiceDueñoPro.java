package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dueño;
import com.example.demo.model.Mascota;
import com.example.demo.repository.RepositoryDueño;

@Profile("Pro")
@Service
public class ServiceDueñoPro implements ServiceDueño{

	Logger l = org.apache.logging.log4j.LogManager.getLogger();

	@Autowired
	@Qualifier("listDueño")
	public RepositoryDueño repository;
	
	@Override
	public void guardar(Dueño dueño) {
		l.info("guardando dueño en PRODUCCION");
		repository.save(dueño);
	}

	@Override
	public List<Dueño> listaDueños() {
		List<Dueño> listaDuenos = repository.listAllDueños();
		
		return listaDuenos;
	}

}
