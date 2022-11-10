package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="casasaitama")
public class CasaSaitama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcasa")
    private int idCasa;

    @Column(name="gastototal")
    private double gastoTotal;

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }
}
