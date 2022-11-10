package com.example.OPM.services;


import com.example.OPM.entity.CasaSaitama;

import java.util.List;
import java.util.Optional;

public interface ICasaSaitamaService {
    public List<CasaSaitama> findAll();
    public Optional<CasaSaitama> findById(int id);
    public void delete(int id);
    public CasaSaitama save(CasaSaitama c);
}
