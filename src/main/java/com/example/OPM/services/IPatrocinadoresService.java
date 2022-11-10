package com.example.OPM.services;

import com.example.OPM.entity.Patrocinadores;

import java.util.List;
import java.util.Optional;

public interface IPatrocinadoresService {
    public List<Patrocinadores> findAll();
    public Optional<Patrocinadores> findById(int id);
    public void delete(int id);
    public Patrocinadores save(Patrocinadores c);
}
