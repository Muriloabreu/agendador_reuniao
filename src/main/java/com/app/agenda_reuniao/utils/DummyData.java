package com.app.agenda_reuniao.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.agenda_reuniao.models.EventoModel;
import com.app.agenda_reuniao.repository.EventoRepository;

import jakarta.annotation.PostConstruct;


@Component
public class DummyData {
	
	@Autowired
    EventoRepository eventoRepository;

    //@PostConstruct
    public void saveEvento(){

        List<EventoModel> eventoList = new ArrayList<>();
        
        EventoModel evento1 = new EventoModel();
        evento1.setNome("Reunião Diária");
        evento1.setLocal("Sala de Reunião 01");
        evento1.setData("30/03/2023");
        evento1.setHoraInicial("08:00");
        evento1.setHoraFinal("09:00");
        
        EventoModel evento2 = new EventoModel();
        evento2.setNome("Reunião de Resultados");
        evento2.setLocal("Sala de Reunião 03");
        evento2.setData("30/03/2023");
        evento2.setHoraInicial("11:00");
        evento2.setHoraFinal("13:00");
        
        
        eventoList.add(evento1);
        eventoList.add(evento2);

        for(EventoModel evento: eventoList){
        	EventoModel eventoSaved = eventoRepository.save(evento);
            System.out.println(eventoSaved.getId());
        }
    }

}
