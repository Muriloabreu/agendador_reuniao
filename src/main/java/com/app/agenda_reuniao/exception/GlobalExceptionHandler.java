package com.app.agenda_reuniao.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ReservaNaoEncontradaException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String tratarReservaNaoEncontrada(
            ReservaNaoEncontradaException ex) {

        return ex.getMessage();
    }

    @ExceptionHandler(ConflitoHorarioException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String tratarConflito(
            ConflitoHorarioException ex) {

        return ex.getMessage();
    }
    
    

}
