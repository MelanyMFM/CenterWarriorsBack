package com.CenterWarriors.controller;

import com.CenterWarriors.model.Rutina;
import com.CenterWarriors.service.RutinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rutinas")
public class RutinaController {
    @Autowired
    private RutinaService rutinaService;

    @GetMapping
    public List<Rutina> obtenerTodasLasRutinas() {
        return rutinaService.obtenerTodasLasRutinas();
    }

    @GetMapping("/{id}")
    public Rutina obtenerRutinaPorId(@PathVariable Long id) {
        return rutinaService.obtenerRutinaPorId(id);
    }

    @PostMapping
    public Rutina crearRutina(@RequestBody Rutina rutina) {
        return rutinaService.crearRutina(rutina);
    }

    @PutMapping("/{id}")
    public Rutina actualizarRutina(@PathVariable Long id, @RequestBody Rutina rutina) {
        return rutinaService.actualizarRutina(id, rutina);
    }

    @DeleteMapping("/{id}")
    public void eliminarRutina(@PathVariable Long id) {
        rutinaService.eliminarRutina(id);
    }
}