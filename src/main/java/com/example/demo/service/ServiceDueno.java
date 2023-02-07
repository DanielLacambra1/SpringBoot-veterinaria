package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Dueno;

public interface ServiceDueno {

	void guardar(Dueno dueno);
	
	List<Dueno> listaDuenos();

	Dueno cogerDuenoPorDni(int dni);

	void actualizar(Dueno dueno);
}
