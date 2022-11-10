package com.example.OPM.services;

import com.example.OPM.entity.Comida;

import java.util.List;
import java.util.Optional;

public interface IComidaService {
    public List<Comida> findAll();
    public Optional<Comida> findById(int id);
    public void delete(int id);
    public Comida save(Comida c);
}
