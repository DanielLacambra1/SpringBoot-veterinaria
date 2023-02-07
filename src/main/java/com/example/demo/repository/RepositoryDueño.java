package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Dueño;

public interface RepositoryDueño {

	void save(Dueño dueño);
	
	List<Dueño> listAllDueños();
}
