package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="monstruos")
public class Monstruos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmonstruo")
    private int idMonstruo;

    @Column(name="nivelamenaza")
    private int nivelAmenaza;

    @Column(name="nombre")
    private String nombre;

    public int getIdMonstruo() {
        return idMonstruo;
    }

    public void setIdMonstruo(int idMonstruo) {
        this.idMonstruo = idMonstruo;
    }

    public int getNivelAmenaza() {
        return nivelAmenaza;
    }

    public void setNivelAmenaza(int nivelAmenaza) {
        this.nivelAmenaza = nivelAmenaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
