package com.centerWarriors.controller;

import com.centerWarriors.model.DiaRutina;
import com.centerWarriors.service.DiaRutinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dias")
public class DiaRutinaController {
    @Autowired
    private DiaRutinaService diaRutinaService;

    @GetMapping
    public List<DiaRutina> obtenerTodosLosDias() {
        return diaRutinaService.obtenerTodosLosDias();
    }

    @GetMapping("/{id}")
    public DiaRutina obtenerDiaPorId(@PathVariable Long id) {
        return diaRutinaService.obtenerDiaPorId(id);
    }

    @PostMapping
    public DiaRutina crearDiaRutina(@RequestBody DiaRutina diaRutina) {
        return diaRutinaService.crearDiaRutina(diaRutina);
    }

    @PutMapping("/{id}")
    public DiaRutina actualizarDiaRutina(@PathVariable Long id, @RequestBody DiaRutina diaRutina) {
        return diaRutinaService.actualizarDiaRutina(id, diaRutina);
    }

    @DeleteMapping("/{id}")
    public void eliminarDiaRutina(@PathVariable Long id) {
        diaRutinaService.eliminarDiaRutina(id);
    }
}