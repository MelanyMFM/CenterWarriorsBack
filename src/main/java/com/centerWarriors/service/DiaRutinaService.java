package com.centerWarriors.service;

import com.centerWarriors.model.DiaRutina;
import com.centerWarriors.repository.DiaRutinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaRutinaService {
    @Autowired
    private DiaRutinaRepository diaRutinaRepository;

    public List<DiaRutina> obtenerTodosLosDias() {
        return diaRutinaRepository.findAll();
    }

    public DiaRutina obtenerDiaPorId(Long id) {
        return diaRutinaRepository.findById(id).orElse(null);
    }

    public DiaRutina crearDiaRutina(DiaRutina diaRutina) {
        return diaRutinaRepository.save(diaRutina);
    }

    public DiaRutina actualizarDiaRutina(Long id, DiaRutina diaActualizado) {
        DiaRutina diaRutina = diaRutinaRepository.findById(id).orElse(null);
        if (diaRutina != null) {
            diaRutina.setDia(diaActualizado.getDia());
            diaRutina.setEjercicios(diaActualizado.getEjercicios());
            return diaRutinaRepository.save(diaRutina);
        }
        return null;
    }

    public void eliminarDiaRutina(Long id) {
        diaRutinaRepository.deleteById(id);
    }
}