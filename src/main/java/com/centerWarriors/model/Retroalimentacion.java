package com.centerWarriors.model;

import jakarta.persistence.*;

@Entity
public class Retroalimentacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentario;
    private String nombreUsuario; // Nombre del usuario (opcional)
    private String emailUsuario;  // Correo del usuario (opcional)

    @ManyToOne
    @JoinColumn(name = "ejercicio_id")
    private Ejercicio ejercicio;

    // Getters y Setters
}