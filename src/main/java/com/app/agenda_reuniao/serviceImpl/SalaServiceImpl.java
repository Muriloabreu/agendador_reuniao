package com.app.agenda_reuniao.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.agenda_reuniao.exception.SalaNaoEncontradaException;
import com.app.agenda_reuniao.models.Sala;
import com.app.agenda_reuniao.repository.SalaRepository;
import com.app.agenda_reuniao.service.SalaService;

@Service
public class SalaServiceImpl implements SalaService{

	private final SalaRepository salaRepository;

    public SalaServiceImpl(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    @Override
    public List<Sala> findAll() {
        return salaRepository.findAll();
    }

    @Override
    public Sala findById(Long id) {
        return salaRepository.findById(id)
                .orElseThrow(() -> new SalaNaoEncontradaException(id));
    }

    @Override
    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }

    @Override
    public void deleteById(Long id) {
        Sala sala = findById(id);
        salaRepository.delete(sala);
    }

}
