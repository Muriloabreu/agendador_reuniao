package com.app.agenda_reuniao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.agenda_reuniao.service.SalaService;


@Controller
@RequestMapping("/salas")
public class SalaController {
	
	 private final SalaService salaService;

	    public SalaController(SalaService salaService) {
	        this.salaService = salaService;
	    }

}
