package com.example.OPM.services;

import com.example.OPM.entity.Monstruos;

import java.util.List;
import java.util.Optional;

public interface IMonstruosService {
    public List<Monstruos> findAll();
    public Optional<Monstruos> findById(int id);
    public void delete(int id);
    public Monstruos save(Monstruos c);
}
