package com.example.demo.controller;


import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Mascota;
import com.example.demo.service.ServiceMascota;

@Controller
public class IndexController {
	
	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
	
	public ServiceMascota serviceMascota;

	@Autowired
	public IndexController(ServiceMascota serviceMascota, ServiceUser serviceuser) {
		this.serviceMascota = serviceMascota;
		this.serviceuser = serviceuser;
	}

	@GetMapping("/")
	public ModelAndView goToIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		Mascota mascota = new Mascota();
		modelAndView.addObject("mascota", mascota);
		
		return modelAndView;
	}

	@PostMapping("addMascotaForm")
	public ModelAndView logStudentInfoAndSendToEndPage(@ModelAttribute("mascota") Mascota mascota) {
		serviceMascota.guardar(mascota);
		l.debug(mascota.toString());
		ModelAndView m = new ModelAndView("end");
		
		m.addObject("addMascota", mascota);
		return m;
	}

}
