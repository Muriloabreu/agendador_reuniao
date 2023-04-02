package com.app.agenda_reuniao.service;

import java.util.List;


import com.app.agenda_reuniao.models.EventoModel;


public interface EventoService {
	
	List<EventoModel> findAll();
	EventoModel findById(Long id);
	EventoModel save(EventoModel evento);
	void deletarEvento(EventoModel evento);

}
