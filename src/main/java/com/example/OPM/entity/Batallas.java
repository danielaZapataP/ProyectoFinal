package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="batalla")
public class Batallas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idbatalla")
    private int idBatalla;

    @Column(name="idheroe")
    private int idHeroe;

    @Column(name="idmonstruo")
    private int idMonstruo;

    @Column(name="ganador")
    private char ganador;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idheroe", insertable = false, updatable = false)
    private Heroes heroe;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idmonstruo", insertable = false, updatable = false)
    private Monstruos monstruo;

    public int getIdBatalla() {
        return idBatalla;
    }

    public void setIdBatalla(int idBatalla) {
        this.idBatalla = idBatalla;
    }

    public int getIdHeroe() {
        return idHeroe;
    }

    public void setIdHeroe(int idHeroe) {
        this.idHeroe = idHeroe;
    }

    public int getIdMonstruo() {
        return idMonstruo;
    }

    public void setIdMonstruo(int idMonstruo) {
        this.idMonstruo = idMonstruo;
    }

    public char getGanador() {
        return ganador;
    }

    public void setGanador(char ganador) {
        this.ganador = ganador;
    }
}
