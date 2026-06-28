package com.app.agenda_reuniao.service;

import java.util.List;


import com.app.agenda_reuniao.models.Reserva;


public interface ReservaService {
	
	List<Reserva> findAll();
	Reserva findById(Long id);
	Reserva save(Reserva reserva);
	void deletarReserva(Reserva reserva);

}
