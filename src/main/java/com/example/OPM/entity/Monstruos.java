package com.example.OPM.entity;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "monstruo", fetch = FetchType.EAGER)
    private List<Batallas> batallas;

    public List<Batallas> getBatallas() {
        return batallas;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Patrocinadores> patrocinadoresMList ;

    public List<Patrocinadores> getPatrocinadoresMList() {
        return patrocinadoresMList;
    }

    public void setPatrocinadoresMList(List<Patrocinadores> patrocinadoresMList) {
        this.patrocinadoresMList = patrocinadoresMList;
    }

    public void setBatallas(List<Batallas> batallas) {
        this.batallas = batallas;
    }

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
