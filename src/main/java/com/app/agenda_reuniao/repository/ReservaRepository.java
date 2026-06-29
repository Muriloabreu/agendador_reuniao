package com.app.agenda_reuniao.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.agenda_reuniao.models.Reserva;
import com.app.agenda_reuniao.models.Sala;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	
	List<Reserva> findBySalaAndData(Sala sala, LocalDate data);

}
