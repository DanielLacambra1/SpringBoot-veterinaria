package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Mascota;

public interface ServiceMascota {

	void guardar(Mascota mascota);
	
	List<Mascota> listaMascotas();
}
