package com.centerWarriors.controller;

import com.centerWarriors.model.Entrenador;
import com.centerWarriors.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entrenadores")
public class EntrenadorController {
    @Autowired
    private EntrenadorService entrenadorService;

    @GetMapping
    public List<Entrenador> obtenerTodosLosEntrenadores() {
        return entrenadorService.obtenerTodosLosEntrenadores();
    }

    @GetMapping("/{id}")
    public Entrenador obtenerEntrenadorPorId(@PathVariable Long id) {
        return entrenadorService.obtenerEntrenadorPorId(id);
    }

    @PostMapping
    public Entrenador crearEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.crearEntrenador(entrenador);
    }

    @PutMapping("/{id}")
    public Entrenador actualizarEntrenador(@PathVariable Long id, @RequestBody Entrenador entrenador) {
        return entrenadorService.actualizarEntrenador(id, entrenador);
    }

    @DeleteMapping("/{id}")
    public void eliminarEntrenador(@PathVariable Long id) {
        entrenadorService.eliminarEntrenador(id);
    }
}