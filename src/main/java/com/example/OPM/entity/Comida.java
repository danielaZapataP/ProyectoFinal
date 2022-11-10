package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="comida")
public class Comida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcomida")
    private int idComida;

    @Column(name="Descripcion")
    private String descripcion;

    @Column(name="precio")
    private float precio;

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
