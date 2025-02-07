package com.centerWarriors.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Ejercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "ejercicio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Retroalimentacion> retroalimentaciones;

    // Getters y Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Retroalimentacion> getRetroalimentaciones() {
        return retroalimentaciones;
    }

    public void setRetroalimentaciones(List<Retroalimentacion> retroalimentaciones) {
        this.retroalimentaciones = retroalimentaciones;
    }
}