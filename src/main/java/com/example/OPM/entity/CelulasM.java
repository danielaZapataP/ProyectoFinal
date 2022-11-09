package com.example.OPM.entity;


import javax.persistence.*;

@Entity
@Table(name="celulasm")
public class CelulasM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcelula")
    private int idCelula;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="documentoheroe")
    private int documentoHeroe;

    @Column(name="idmonstruo")
    private int idMonstruo;

    public int getIdCelula() {
        return idCelula;
    }

    public void setIdCelula(int idCelula) {
        this.idCelula = idCelula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDocumentoHeroe() {
        return documentoHeroe;
    }

    public void setDocumentoHeroe(int documentoHeroe) {
        this.documentoHeroe = documentoHeroe;
    }

    public int getIdMonstruo() {
        return idMonstruo;
    }

    public void setIdMonstruo(int idMonstruo) {
        this.idMonstruo = idMonstruo;
    }
}
