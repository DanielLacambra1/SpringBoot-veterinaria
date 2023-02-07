package com.example.demo.controller;


import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceDueno;
import com.example.demo.service.ServiceMascota;

@Controller
public class IndexController {
	
	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
	
	public ServiceMascota serviceMascota;
	public ServiceDueno serviceDueno;

	@Autowired
	public IndexController(ServiceMascota serviceMascota, ServiceDueno serviceDueno, ServiceUser serviceuser) {
		this.serviceMascota = serviceMascota;
		this.serviceDueno = serviceDueno;
		this.serviceuser = serviceuser;
	}

	@GetMapping("/")
	public ModelAndView goToIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		
		Mascota mascota = new Mascota();
		Dueno dueno = new Dueno();
		
		List<Mascota> listMascotas = serviceMascota.listaMascotas();
		
		modelAndView.addObject("mascota", mascota);
		modelAndView.addObject("dueno",dueno);
		modelAndView.addObject("listaMascotas",listMascotas);
		
		return modelAndView;
	}

	@PostMapping("addMascotaForm")
	public ModelAndView logMascotaInfoAndSendToEndPage(@ModelAttribute("mascota") Mascota mascota) {
		serviceMascota.guardar(mascota);
		l.debug(mascota.toString());
		ModelAndView m = new ModelAndView("end");
		
		m.addObject("addMascota", mascota);
		return m;
	}
	
	@PostMapping("addDuenoForm")
	public ModelAndView logDuenoInfoAndSendToEndPage(@ModelAttribute("dueno") Dueno duenoConMascotaString) {
		String mascotaAMontar = duenoConMascotaString.mascotaDescompuesta;
		String[] partesDeMascota = mascotaAMontar.split("\\|");
		System.out.println(Arrays.asList(partesDeMascota));

		int numChip = Integer.parseInt(partesDeMascota[0]);
		String nombre = partesDeMascota[1];
		boolean vacunacion = false;
		if(partesDeMascota[2] == "true") {
			vacunacion = true;
		}

		Mascota mascotaFinal = new Mascota(numChip, nombre, vacunacion);
		Dueno dueno = new Dueno(duenoConMascotaString.getNombre(), duenoConMascotaString.getDni(), mascotaFinal);

		serviceDueno.guardar(dueno);
		l.debug(dueno.toString());
		ModelAndView m = new ModelAndView("end");
		
		m.addObject("addDueno", dueno);	// no funciona hasta que en end se le pase salida de datos
		return m;
	}
	


}
