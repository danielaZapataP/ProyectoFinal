package com.example.OPM.services;

import com.example.OPM.entity.Batallas;

import java.util.List;
import java.util.Optional;

public interface IBatallasService {
    public List<Batallas> findAll();
    public Optional<Batallas> findById(int id);
    public void delete(int id);
    public Batallas save(Batallas c);
}
