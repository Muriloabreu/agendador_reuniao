package com.app.agenda_reuniao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.agenda_reuniao.models.EventoModel;
import com.app.agenda_reuniao.service.EventoService;

@Controller
public class EvetoController {
	
	@Autowired
	EventoService eventoService;

	@RequestMapping(value = "/agendar", method = RequestMethod.GET)
	public ModelAndView getEventos() {
		ModelAndView mv = new ModelAndView("agendareuniao"); /*Nome da Pagina html*/
		List<EventoModel> eventos = eventoService.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
	
	@RequestMapping(value = "/agendar/{id}", method = RequestMethod.GET)
	public ModelAndView getEventoDetails(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("reservaDetalhes"); /*Nome da Pagina html*/
		EventoModel evento = eventoService.findById(id);
		mv.addObject("evento", evento);
		return mv;
	} 
		
}
