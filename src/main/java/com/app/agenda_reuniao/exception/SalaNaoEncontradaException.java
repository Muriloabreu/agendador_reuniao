package com.app.agenda_reuniao.exception;

public class SalaNaoEncontradaException extends RuntimeException {
	
	public SalaNaoEncontradaException(Long id) {
        super("Sala não encontrada. ID: " + id);
    }

}
