package com.app.agenda_reuniao.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.agenda_reuniao.models.Reserva;
import com.app.agenda_reuniao.service.ReservaService;

import jakarta.validation.Valid;

@Controller
public class ReservaController {
	
	
	private final ReservaService eventoService;	

	public ReservaController(ReservaService eventoService) {
		this.eventoService = eventoService;
	}

	@RequestMapping(value = "/agendar", method = RequestMethod.GET)
	public ModelAndView getEventos() {
		ModelAndView mv = new ModelAndView("agendareuniao"); /*Nome da Pagina html*/
		List<Reserva> eventos = eventoService.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
	
	@RequestMapping(value = "/agendar/{id}", method = RequestMethod.GET)
	public ModelAndView getReservaDetails(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("reservaDetalhes"); /*Nome da Pagina html*/
		Reserva evento = eventoService.findById(id);
		mv.addObject("evento", evento);
		return mv;
	} 
	
	@RequestMapping(value = "/agendar/{id}/editar", method = RequestMethod.GET)
	public ModelAndView editReserva(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("editForm"); /*Nome da Pagina html*/
		Reserva evento = eventoService.findById(id);
		mv.addObject("evento", evento);
		return mv;
	}
	
	@RequestMapping(value = "/agendar/{id}", method = RequestMethod.POST)
	public String update(@Valid Reserva evento, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
	 		 attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
	 		 return "redirect:/newReserva";
	 	 }	
		eventoService.save(evento);
		return "redirect:/agendar";
	}
	
	@RequestMapping("/deletar")
	public String deletarEvento( Long id) {
		Reserva evento = eventoService.findById(id);
		eventoService.deletarEvento(evento);
		
		return "redirect:/agendar";
	}
	
		
	@RequestMapping(value = "/newReserva", method = RequestMethod.GET)
	public String form() {
		
		return "reservaForm";
	}
	
	@RequestMapping(value = "/newReserva", method = RequestMethod.POST)
	public String save(@Valid Reserva evento, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
	 		 attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
	 		 return "redirect:/newReserva";
	 	 }	
		eventoService.save(evento);
		return "redirect:/agendar";
	}
}
