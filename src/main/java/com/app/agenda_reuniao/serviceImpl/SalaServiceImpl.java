package com.app.agenda_reuniao.serviceImpl;

import java.util.List;

import com.app.agenda_reuniao.models.Sala;
import com.app.agenda_reuniao.service.SalaService;

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
