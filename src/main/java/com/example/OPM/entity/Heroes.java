package com.example.OPM.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="heroes")
public class Heroes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idheroe")
    private int idHeroe;

    @Column(name="documentoheroe")
    private int documentoHeroe;

    @Column(name="rango")
    private int Rango;

    @Column(name="nombre")
    private String nombre;

    @Column(name="habilidad")
    private String habilidad;

    @Column(name="lugarresidencia")
    private String lugarResidencia;

    @Column(name="telefono")
    private String telefono;

    @OneToMany(mappedBy = "heroe", fetch = FetchType.EAGER)
    private List<Batallas> batallas;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Patrocinadores> patrocinadoresHList ;

    public List<Patrocinadores> getPatrocinadoresHList() {
        return patrocinadoresHList;
    }

    public void setPatrocinadoresHList(List<Patrocinadores> patrocinadoresHList) {
        this.patrocinadoresHList = patrocinadoresHList;
    }

    public List<Batallas> getBatallas() {
        return batallas;
    }

    public void setBatallas(List<Batallas> batallas) {
        this.batallas = batallas;
    }

    public int getIdHeroe() {
        return idHeroe;
    }

    public void setIdHeroe(int idHeroe) {
        this.idHeroe = idHeroe;
    }

    public int getDocumentoHeroe() {
        return documentoHeroe;
    }

    public void setDocumentoHeroe(int documentoHeroe) {
        this.documentoHeroe = documentoHeroe;
    }

    public int getRango() {
        return Rango;
    }

    public void setRango(int rango) {
        Rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
