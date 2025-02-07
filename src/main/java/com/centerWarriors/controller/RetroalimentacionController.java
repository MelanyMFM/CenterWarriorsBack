package com.centerWarriors.controller;

import com.centerWarriors.model.Retroalimentacion;
import com.centerWarriors.service.RetroalimentacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/retroalimentaciones")
public class RetroalimentacionController {
    @Autowired
    private RetroalimentacionService retroalimentacionService;

    @GetMapping
    public List<Retroalimentacion> obtenerTodasLasRetroalimentaciones() {
        return retroalimentacionService.obtenerTodasLasRetroalimentaciones();
    }

    @PostMapping
    public Retroalimentacion crearRetroalimentacion(@RequestBody Retroalimentacion retroalimentacion) {
        return retroalimentacionService.crearRetroalimentacion(retroalimentacion);
    }
}