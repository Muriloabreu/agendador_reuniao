package com.app.agenda_reuniao.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.agenda_reuniao.models.Reserva;
import com.app.agenda_reuniao.repository.ReservaRepository;

import jakarta.annotation.PostConstruct;


@Component
public class DummyData {
	
	@Autowired
    ReservaRepository eventoRepository;

    //@PostConstruct
    public void saveEvento(){
/*
        List<Reserva> eventoList = new ArrayList<>();
        
        Reserva evento1 = new Reserva();
        evento1.setNome("Reunião Diária");
        evento1.setLocal("Sala de Reunião 01");
        evento1.setData("30/03/2023");
        evento1.setHoraInicial("08:00");
        evento1.setHoraFinal("09:00");
        
        Reserva evento2 = new Reserva();
        evento2.setNome("Reunião de Resultados");
        evento2.setLocal("Sala de Reunião 03");
        evento2.setData("30/03/2023");
        evento2.setHoraInicial("11:00");
        evento2.setHoraFinal("13:00");
        
        
        eventoList.add(evento1);
        eventoList.add(evento2);

        for(Reserva evento: eventoList){
        	Reserva eventoSaved = eventoRepository.save(evento);
            System.out.println(eventoSaved.getId());
        }
    }
*/
}
}