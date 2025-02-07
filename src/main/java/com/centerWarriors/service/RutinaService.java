package com.centerWarriors.service;

import com.centerWarriors.model.Rutina;
import com.centerWarriors.repository.RutinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaService {
    @Autowired
    private RutinaRepository rutinaRepository;

    public List<Rutina> obtenerTodasLasRutinas() {
        return rutinaRepository.findAll();
    }

    public Rutina obtenerRutinaPorId(Long id) {
        return rutinaRepository.findById(id).orElse(null);
    }

    public Rutina crearRutina(Rutina rutina) {
        return rutinaRepository.save(rutina);
    }

    public Rutina actualizarRutina(Long id, Rutina rutinaActualizada) {
        Rutina rutina = rutinaRepository.findById(id).orElse(null);
        if (rutina != null) {
            rutina.setNombre(rutinaActualizada.getNombre());
            rutina.setEntrenador(rutinaActualizada.getEntrenador());
            rutina.setObjetivo(rutinaActualizada.getObjetivo());
            rutina.setDificultad(rutinaActualizada.getDificultad());
            rutina.setDias(rutinaActualizada.getDias());
            return rutinaRepository.save(rutina);
        }
        return null;
    }

    public void eliminarRutina(Long id) {
        rutinaRepository.deleteById(id);
    }
}