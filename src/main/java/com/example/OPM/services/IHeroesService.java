package com.example.OPM.services;

import com.example.OPM.entity.Heroes;

import java.util.List;
import java.util.Optional;

public interface IHeroesService {
    public List<Heroes> findAll();
    public Optional<Heroes> findById(int id);
    public void delete(int id);
    public Heroes save(Heroes c);
}
