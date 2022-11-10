package com.example.OPM.entity;

import javax.persistence.*;

@Entity
@Table(name="fans")
public class Fans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idfan")
    private int idFan;

    @Column(name="documentofan")
    private int documentoFan;

    public int getIdFan() {
        return idFan;
    }

    public void setIdFan(int idFan) {
        this.idFan = idFan;
    }

    public int getDocumentoFan() {
        return documentoFan;
    }

    public void setDocumentoFan(int documentoFan) {
        this.documentoFan = documentoFan;
    }
}
