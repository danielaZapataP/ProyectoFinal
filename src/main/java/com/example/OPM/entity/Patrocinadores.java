package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="patrocinadores")
public class Patrocinadores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpatrocinador")
    private int idPatrocinador;

    @Column(name="documentopatrocinador")
    private int documentoPatrocinador;

    @Column(name="nombre")
    private String nombre;

    public int getIdPatrocinador() {
        return idPatrocinador;
    }

    public void setIdPatrocinador(int idPatrocinador) {
        this.idPatrocinador = idPatrocinador;
    }

    public int getDocumentoPatrocinador() {
        return documentoPatrocinador;
    }

    public void setDocumentoPatrocinador(int documentoPatrocinador) {
        this.documentoPatrocinador = documentoPatrocinador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
