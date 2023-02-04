package com.example.demo.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mascota;
import com.example.demo.repository.RepositoryMascota;

@Profile("Pro")
@Service
public class ServiceMascotaPro implements ServiceMascota{

	Logger l = org.apache.logging.log4j.LogManager.getLogger();

	@Autowired
	@Qualifier("listMascota")
	public RepositoryMascota repository;
	
	@Override
	public void guardar(Mascota mascota) {
		l.info("guardando mascota en PRODUCCION");
		repository.save(mascota);
	}
	
	
	public List<Mascota> listaMascotas(){
		List<Mascota> listaMasc = repository.listAllMascotas();
		
		return listaMasc;
	}

}
