package com.app.agenda_reuniao.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.agenda_reuniao.exception.ReservaNaoEncontradaException;
import com.app.agenda_reuniao.models.Reserva;
import com.app.agenda_reuniao.repository.ReservaRepository;
import com.app.agenda_reuniao.service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	
	private final ReservaRepository reservaRepository;
	
	public ReservaServiceImpl(ReservaRepository reservaRepository) {
	    this.reservaRepository = reservaRepository;
	}

	@Override
	public List<Reserva> findAll() {
		
		return reservaRepository.findAll();
	}

	
	@Override
	public Reserva save(Reserva evento) {
		
		return reservaRepository.save(evento);
	}

	@Override
	public void deletarReserva(Reserva reserva) {
		
		reservaRepository.delete(reserva);
	}

	@Override
	public Reserva findById(Long id) {
		return reservaRepository.findById(id)
	            .orElseThrow(() -> new ReservaNaoEncontradaException(id));
	}

	

	

}
