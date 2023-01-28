package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Mascota;

@Repository("listMascota")
public class ListRepositoryMascota implements RepositoryMascota  {

	static List<Mascota> list = new ArrayList<>();
	
	@Override
	public void save(Mascota mascota) {
		list.add(mascota);

		for (Mascota m : list) {
			System.out.println(m);
		}

		list.forEach(System.out::println);

		list.forEach((m) -> System.out.println(m));
		
	}

}
