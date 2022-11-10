package com.example.OPM.services;

import com.example.OPM.entity.CelulasM;

import java.util.List;
import java.util.Optional;

public interface ICelulasMService {
    public List<CelulasM> findAll();
    public Optional<CelulasM> findById(int id);
    public void delete(int id);
    public CelulasM save(CelulasM c);
}
