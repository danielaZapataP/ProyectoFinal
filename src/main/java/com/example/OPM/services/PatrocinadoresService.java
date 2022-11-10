package com.example.OPM.services;

import com.example.OPM.dao.IPatrocinadoresDAO;
import com.example.OPM.entity.Patrocinadores;

import java.util.List;
import java.util.Optional;

public class PatrocinadoresService implements IPatrocinadoresService{
    private IPatrocinadoresDAO PatrocinadoresDAO;
    @Override
    public List<Patrocinadores> findAll() {
        return PatrocinadoresDAO.findAll();
    }

    @Override
    public Optional<Patrocinadores> findById(int id) {
        return PatrocinadoresDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        PatrocinadoresDAO.deleteById(id);
    }

    @Override
    public Patrocinadores save(Patrocinadores c) {
        return PatrocinadoresDAO.save(c);
    }
}
