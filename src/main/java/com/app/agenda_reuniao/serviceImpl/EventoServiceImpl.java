package com.app.agenda_reuniao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.agenda_reuniao.models.Reserva;
import com.app.agenda_reuniao.repository.EventoRepository;
import com.app.agenda_reuniao.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	EventoRepository eventoRepository;

	@Override
	public List<Reserva> findAll() {
		
		return eventoRepository.findAll();
	}

	@Override
	public Reserva findById(Long id) {
		
		return eventoRepository.findById(id).get();
	}

	@Override
	public Reserva save(Reserva evento) {
		
		return eventoRepository.save(evento);
	}

	@Override
	public void deletarEvento(Reserva evento) {
		
		 eventoRepository.delete(evento);
	}

	

	

}
