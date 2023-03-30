package com.app.agenda_reuniao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.agenda_reuniao.models.EventoModel;
import com.app.agenda_reuniao.service.EventoService;

public class EvetoController {
	
	@Autowired
	EventoService eventoService;

	@RequestMapping(value = "/agendareuniao")
	public ModelAndView getEventos() {
		ModelAndView mv = new ModelAndView("eventos");
		List<EventoModel> eventos = eventoService.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
		
}
