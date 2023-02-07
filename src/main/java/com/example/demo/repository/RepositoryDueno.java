package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Dueno;

public interface RepositoryDueno {

	void save(Dueno dueno);
	
	List<Dueno> listAllDuenos();

	Dueno cogerDuenoPorDni(int dni);

	void actualizar(Dueno dueno);
}
