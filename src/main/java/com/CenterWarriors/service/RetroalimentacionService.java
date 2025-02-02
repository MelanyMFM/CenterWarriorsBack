package com.CenterWarriors.service;

import com.CenterWarriors.model.Retroalimentacion;
import com.CenterWarriors.repository.RetroalimentacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetroalimentacionService {
    @Autowired
    private RetroalimentacionRepository retroalimentacionRepository;

    public List<Retroalimentacion> obtenerTodasLasRetroalimentaciones() {
        return retroalimentacionRepository.findAll();
    }

    public Retroalimentacion crearRetroalimentacion(Retroalimentacion retroalimentacion) {
        return retroalimentacionRepository.save(retroalimentacion);
    }
}