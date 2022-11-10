package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="partidos")
public class Partidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpartidos")
    private int idPartidos;

    @Column(name="descripcion")
    private String descripcion;

    public int getIdPartidos() {
        return idPartidos;
    }

    public void setIdPartidos(int idPartidos) {
        this.idPartidos = idPartidos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
