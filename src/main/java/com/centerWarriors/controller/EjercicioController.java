package com.centerWarriors.controller;

import com.centerWarriors.model.Ejercicio;
import com.centerWarriors.service.EjercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ejercicios")
public class EjercicioController {
    @Autowired
    private EjercicioService ejercicioService;

    @GetMapping
    public List<Ejercicio> obtenerTodosLosEjercicios() {
        return ejercicioService.obtenerTodosLosEjercicios();
    }

    @GetMapping("/{id}")
    public Ejercicio obtenerEjercicioPorId(@PathVariable Long id) {
        return ejercicioService.obtenerEjercicioPorId(id);
    }

    @PostMapping
    public Ejercicio crearEjercicio(@RequestBody Ejercicio ejercicio) {
        return ejercicioService.crearEjercicio(ejercicio);
    }

    @PutMapping("/{id}")
    public Ejercicio actualizarEjercicio(@PathVariable Long id, @RequestBody Ejercicio ejercicio) {
        return ejercicioService.actualizarEjercicio(id, ejercicio);
    }

    @DeleteMapping("/{id}")
    public void eliminarEjercicio(@PathVariable Long id) {
        ejercicioService.eliminarEjercicio(id);
    }
}