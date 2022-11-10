package com.example.OPM.services;

import com.example.OPM.entity.Videojuegos;

import java.util.List;
import java.util.Optional;

public interface IVideojuegosService {
    public List<Videojuegos> findAll();
    public Optional<Videojuegos> findById(int id);
    public void delete(int id);
    public Videojuegos save(Videojuegos c);
}
