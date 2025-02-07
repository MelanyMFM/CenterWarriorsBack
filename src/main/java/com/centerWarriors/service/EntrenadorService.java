package com.centerWarriors.service;

import com.centerWarriors.model.Entrenador;
import com.centerWarriors.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {
    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public List<Entrenador> obtenerTodosLosEntrenadores() {
        return entrenadorRepository.findAll();
    }

    public Entrenador obtenerEntrenadorPorId(Long id) {
        return entrenadorRepository.findById(id).orElse(null);
    }

    public Entrenador crearEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public Entrenador actualizarEntrenador(Long id, Entrenador entrenadorActualizado) {
        Entrenador entrenador = entrenadorRepository.findById(id).orElse(null);
        if (entrenador != null) {
            entrenador.setNombre(entrenadorActualizado.getNombre());
            entrenador.setCodigo(entrenadorActualizado.getCodigo());
            return entrenadorRepository.save(entrenador);
        }
        return null;
    }

    public void eliminarEntrenador(Long id) {
        entrenadorRepository.deleteById(id);
    }
}