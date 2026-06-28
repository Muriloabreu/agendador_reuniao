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
	
	
	private final ReservaService reservaService;

	public ReservaController(ReservaService reservaService) {
	    this.reservaService = reservaService;
	}

	@RequestMapping(value = "/agendar", method = RequestMethod.GET)
	public ModelAndView getReservas() {
		ModelAndView mv = new ModelAndView("agendareuniao"); /*Nome da Pagina html*/
		List<Reserva> reservas = reservaService.findAll();
		mv.addObject("reservas", reservas);
		return mv;
	}
	
	@RequestMapping(value = "/agendar/{id}", method = RequestMethod.GET)
	public ModelAndView getReservaDetails(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("reservaDetalhes"); /*Nome da Pagina html*/
		Reserva reserva = reservaService.findById(id);
		mv.addObject("reserva", reserva);
		return mv;
	} 
	
	@RequestMapping(value = "/agendar/{id}/editar", method = RequestMethod.GET)
	public ModelAndView editReserva(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("editForm"); /*Nome da Pagina html*/
		Reserva reserva = reservaService.findById(id);
		mv.addObject("reserva", reserva);
		return mv;
	}
	
	@RequestMapping(value = "/agendar/{id}", method = RequestMethod.POST)
	public String update(@Valid Reserva reserva, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
	 		 attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
	 		 return "redirect:/newReserva";
	 	 }	
		reservaService.save(reserva);
		return "redirect:/agendar";
	}
	
	@RequestMapping("/deletar")
	public String deletarReserva( Long id) {
		Reserva reserva = reservaService.findById(id);
		reservaService.deletarReserva(reserva);
		
		return "redirect:/agendar";
	}
	
		
	@RequestMapping(value = "/newReserva", method = RequestMethod.GET)
	public String form() {
		
		return "reservaForm";
	}
	
	@RequestMapping(value = "/newReserva", method = RequestMethod.POST)
	public String save(@Valid Reserva reserva, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
	 		 attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
	 		 return "redirect:/newReserva";
	 	 }	
		reservaService.save(reserva);
		return "redirect:/agendar";
	}
}
