package com.app.agenda_reuniao.exception;

public class ReservaNaoEncontradaException extends RuntimeException{
		
	public ReservaNaoEncontradaException(Long id) {
    super("Reserva não encontrada. ID: " + id);
}
}
