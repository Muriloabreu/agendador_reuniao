package com.app.agenda_reuniao.service;

import java.util.List;

import com.app.agenda_reuniao.models.Sala;


public interface SalaService {
	
	List<Sala> findAll();

    Sala findById(Long id);

    Sala save(Sala sala);

    void deleteById(Long id);

}
