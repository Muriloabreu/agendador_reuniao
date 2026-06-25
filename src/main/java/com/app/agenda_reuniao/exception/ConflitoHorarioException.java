package com.app.agenda_reuniao.exception;

public class ConflitoHorarioException extends RuntimeException {
	
	public ConflitoHorarioException() {
        super("Já existe uma reserva nesse horário.");
    }
}
