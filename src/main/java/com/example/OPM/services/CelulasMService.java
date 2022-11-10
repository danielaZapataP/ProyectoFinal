package com.example.OPM.services;

import com.example.OPM.dao.ICelulasMDAO;
import com.example.OPM.entity.CelulasM;

import java.util.List;
import java.util.Optional;

public class CelulasMService implements ICelulasMService{
    private ICelulasMDAO CelulasMDAO;
    @Override
    public List<CelulasM> findAll() {
        return CelulasMDAO.findAll();
    }

    @Override
    public Optional<CelulasM> findById(int id) {
        return CelulasMDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        CelulasMDAO.deleteById(id);
    }

    @Override
    public CelulasM save(CelulasM c) {
        return CelulasMDAO.save(c);
    }
}
