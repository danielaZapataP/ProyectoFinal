package com.example.OPM.services;


import com.example.OPM.dao.ICasaSaitamaDAO;
import com.example.OPM.entity.CasaSaitama;

import java.util.List;
import java.util.Optional;

public class CasaSaitamaService implements ICasaSaitamaService{
    private ICasaSaitamaDAO casaSaitamaDAO;
    @Override
    public List<CasaSaitama> findAll() {
        return casaSaitamaDAO.findAll();
    }

    @Override
    public Optional<CasaSaitama> findById(int id) {
        return casaSaitamaDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        casaSaitamaDAO.deleteById(id);
    }

    @Override
    public CasaSaitama save(CasaSaitama c) {
        return casaSaitamaDAO.save(c);
    }
}
