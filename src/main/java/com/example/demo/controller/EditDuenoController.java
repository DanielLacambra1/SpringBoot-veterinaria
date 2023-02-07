package com.example.demo.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.ServiceDueno;
import com.example.demo.model.Dueno;
import com.example.demo.model.Mascota;

@Controller
public class EditDuenoController {

    Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);
	public ServiceUser serviceuser;
    public ServiceDueno serviceDueno;
    
    Mascota mascotaSiempreMisma = new Mascota();

    @Autowired
    public EditDuenoController(ServiceDueno serviceDueno, ServiceUser serviceUser) {
        this.serviceDueno = serviceDueno;
        this.serviceuser = serviceUser;
    }

    @GetMapping("/editDueno")
	public ModelAndView goToEditDueno(@RequestParam("dni") int dni) {

        Dueno duenoParaEditar = serviceDueno.cogerDuenoPorDni(dni);
        mascotaSiempreMisma = duenoParaEditar.getMascota();

		ModelAndView modelAndView = new ModelAndView("editDueno");
		modelAndView.addObject("duenoParaEditar",duenoParaEditar);
		
		return modelAndView;
	}

    @PostMapping("editDuenoForm")
    public ModelAndView editAddDueno(@ModelAttribute("dueno") Dueno dueno) {
        dueno.setMascota(mascotaSiempreMisma);
        l.debug(dueno.toString());
		serviceDueno.actualizar(dueno);

		ModelAndView modelAndView = new ModelAndView("end");
		
		return modelAndView;
	}


    
}
