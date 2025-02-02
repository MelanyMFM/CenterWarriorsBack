package com.CenterWarriors.service;

import com.CenterWarriors.model.Ejercicio;
import com.CenterWarriors.repository.EjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioService {
    @Autowired
    private EjercicioRepository ejercicioRepository;

    public List<Ejercicio> obtenerTodosLosEjercicios() {
        return ejercicioRepository.findAll();
    }

    public Ejercicio obtenerEjercicioPorId(Long id) {
        return ejercicioRepository.findById(id).orElse(null);
    }

    public Ejercicio crearEjercicio(Ejercicio ejercicio) {
        return ejercicioRepository.save(ejercicio);
    }

    public Ejercicio actualizarEjercicio(Long id, Ejercicio ejercicioActualizado) {
        Ejercicio ejercicio = ejercicioRepository.findById(id).orElse(null);
        if (ejercicio != null) {
            ejercicio.setNombre(ejercicioActualizado.getNombre());
            ejercicio.setDescripcion(ejercicioActualizado.getDescripcion());
            return ejercicioRepository.save(ejercicio);
        }
        return null;
    }

    public void eliminarEjercicio(Long id) {
        ejercicioRepository.deleteById(id);
    }
}