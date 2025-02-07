package com.centerWarriors.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Rutina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String entrenador;
    private String objetivo;
    private String dificultad;

    @OneToMany(mappedBy = "rutina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiaRutina> dias;

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public List<DiaRutina> getDias() {
        return dias;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setDias(List<DiaRutina> dias) {
        this.dias = dias;
    }
}