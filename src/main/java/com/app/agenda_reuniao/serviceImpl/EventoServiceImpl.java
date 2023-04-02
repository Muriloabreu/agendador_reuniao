package com.app.agenda_reuniao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.agenda_reuniao.models.EventoModel;
import com.app.agenda_reuniao.repository.EventoRepository;
import com.app.agenda_reuniao.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	EventoRepository eventoRepository;

	@Override
	public List<EventoModel> findAll() {
		
		return eventoRepository.findAll();
	}

	@Override
	public EventoModel findById(Long id) {
		
		return eventoRepository.findById(id).get();
	}

	@Override
	public EventoModel save(EventoModel evento) {
		
		return eventoRepository.save(evento);
	}

	@Override
	public void deletarEvento(EventoModel evento) {
		
		 eventoRepository.delete(evento);
	}

	

	

}
