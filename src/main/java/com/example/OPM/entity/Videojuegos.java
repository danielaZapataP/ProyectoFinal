package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="videojuegos")
public class Videojuegos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvideojuego")
    private int idVideojuego;

    @Column(name="nombre")
    private String nombre;

    public int getIdVideojuego() {

        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
