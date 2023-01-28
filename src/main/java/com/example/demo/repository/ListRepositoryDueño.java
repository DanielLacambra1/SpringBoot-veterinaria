package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Dueño;

@Repository("listDueño")
public class ListRepositoryDueño implements RepositoryDueño {

	static List<Dueño> list = new ArrayList<>();

	@Override
	public void save(Dueño dueño) {
		list.add(dueño);

		for (Dueño d : list) {
			System.out.println(d);
		}

		list.forEach(System.out::println);

		list.forEach((d) -> System.out.println(d));
		
		
	}
	
	
	
}
