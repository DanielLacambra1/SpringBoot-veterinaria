package com.example.demo.controller;


import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueño;
import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceDueño;
import com.example.demo.service.ServiceMascota;

@Controller
public class IndexController {
	
	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
	
	public ServiceMascota serviceMascota;
	public ServiceDueño serviceDueño;

	@Autowired
	public IndexController(ServiceMascota serviceMascota, ServiceDueño serviceDueño, ServiceUser serviceuser) {
		this.serviceMascota = serviceMascota;
		this.serviceDueño = serviceDueño;
		this.serviceuser = serviceuser;
	}

	@GetMapping("/")
	public ModelAndView goToIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		
		Mascota mascota = new Mascota();
		Dueño dueño = new Dueño();
		
		List<Mascota> listMascotas = serviceMascota.listaMascotas();
		
		modelAndView.addObject("mascota", mascota);
		modelAndView.addObject("dueño",dueño);
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
	
	@PostMapping("addDueñoForm")
	public ModelAndView logDueñoInfoAndSendToEndPage(@ModelAttribute("dueño") Dueño dueño) {
		
		List<Mascota> listMascotas = serviceMascota.listaMascotas();
		//Mascota mascota;
		//mascota = listMascotas.stream().filter(mascota -> mascota.getNombre() == nombre);
		
		serviceDueño.guardar(dueño);
		l.debug(dueño.toString());
		ModelAndView m = new ModelAndView("end");
		
		m.addObject("addDueño", dueño);	// no funciona hasta que en end se le pase salida de datos
		return m;
	}
	


}
