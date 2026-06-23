package com.app.agenda_reuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.agenda_reuniao.models.Reserva;

public interface EventoRepository extends JpaRepository<Reserva, Long>{

}
