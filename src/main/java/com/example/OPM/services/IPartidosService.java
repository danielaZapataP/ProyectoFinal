package com.example.OPM.services;

import com.example.OPM.entity.Partidos;

import java.util.List;
import java.util.Optional;

public interface IPartidosService {
    public List<Partidos> findAll();
    public Optional<Partidos> findById(int id);
    public void delete(int id);
    public Partidos save(Partidos c);
}
