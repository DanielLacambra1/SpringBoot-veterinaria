package com.example.demo.service;

import java.util.List;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dueno;
import com.example.demo.repository.RepositoryDueno;

@Service
public abstract class serviceDuenoAbstract implements ServiceDueno {

    Logger l = org.apache.logging.log4j.LogManager.getLogger();

	@Autowired
	@Qualifier("listDueno")
	public RepositoryDueno repository;


    public String colorPiel;        // VARIABLE SEGUN PERFILEEEEEEEEEEES

    @Override
    public void actualizar(Dueno dueno) {
        repository.actualizar(dueno);
    }

    @Override
    public Dueno cogerDuenoPorDni(int dni) {
        Dueno dueno = repository.cogerDuenoPorDni(dni);
		return dueno;
    }

    @Override
    public void guardar(Dueno dueno) {
        l.info("guardando dueno en PRODUCCION");
        dueno.setColorPiel(colorPiel);
        System.out.println("color piel: " + dueno.getColorPiel());
		repository.save(dueno);
    }

    @Override
    public List<Dueno> listaDuenos() {
        List<Dueno> listaDuenos = repository.listAllDuenos();
		return listaDuenos;
    }
    
}
