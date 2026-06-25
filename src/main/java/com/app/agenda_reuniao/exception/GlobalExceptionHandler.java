package com.app.agenda_reuniao.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.agenda_reuniao.Dto.ErroResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	//tratamento informa hora, tipo, status http
	@ExceptionHandler(ReservaNaoEncontradaException.class)
	public ResponseEntity<ErroResponse>
	tratarReservaNaoEncontrada(
	        ReservaNaoEncontradaException ex) {

	    ErroResponse erro =
	            new ErroResponse(
	                    LocalDateTime.now(),
	                    404,
	                    ex.getMessage());

	    return ResponseEntity
	            .status(HttpStatus.NOT_FOUND)
	            .body(erro);
	}

    @ExceptionHandler(ConflitoHorarioException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String tratarConflito(
            ConflitoHorarioException ex) {

        return ex.getMessage();
    }
    
    

}
