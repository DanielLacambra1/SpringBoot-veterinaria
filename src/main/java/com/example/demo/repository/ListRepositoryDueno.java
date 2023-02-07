package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Dueno;

@Repository("listDueno")
public class ListRepositoryDueno implements RepositoryDueno {

	static List<Dueno> list = new ArrayList<>();

	@Override
	public void save(Dueno dueno) {
		list.add(dueno);

		for (Dueno d : list) {
			System.out.println(d);
		}

		list.forEach(System.out::println);

		list.forEach((d) -> System.out.println(d));
		
	}

	@Override
	public List<Dueno> listAllDuenos() {
		List<Dueno> lista = list;
		
		return lista;
	}

	@Override
	public Dueno cogerDuenoPorDni(int dni) {
		Dueno dueno = new Dueno();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getDni() == dni)
				dueno = list.get(i);
		}

		return dueno;
	}

	@Override
	public void actualizar(Dueno dueno) {
		list.add(dueno);

		for (Dueno d : list) {
			System.out.println(d);
		}

		list.forEach(System.out::println);

		list.forEach((d) -> System.out.println(d));
	}
	
	
	
	
}
