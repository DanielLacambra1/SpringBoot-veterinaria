package com.example.demo.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Dueno;
import com.example.demo.service.ServiceDueno;

@Controller
public class ListDuenosController {

	Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
	public ServiceDueno serviceDueno;
	
	
	@Autowired
	public ListDuenosController(ServiceDueno serviceDueno, ServiceUser serviceUser) {
		this.serviceDueno = serviceDueno;
		this.serviceuser = serviceUser;
	}
	
	@GetMapping("listDuenos")
	public ModelAndView goToListDuenos() {
		ModelAndView modelAndView = new ModelAndView("listDuenos");
		List<Dueno> listaDuenos = serviceDueno.listaDuenos();
		
		modelAndView.addObject("listaDuenos",listaDuenos);
		
		return modelAndView;
	}
	
	
}
