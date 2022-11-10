package com.example.OPM.services;

import com.example.OPM.dao.IMonstruosDAO;
import com.example.OPM.entity.Monstruos;

import java.util.List;
import java.util.Optional;

public class MonstruosService implements IMonstruosService{
    private IMonstruosDAO MonstruosDAO;
    @Override
    public List<Monstruos> findAll() {
        return MonstruosDAO.findAll();
    }

    @Override
    public Optional<Monstruos> findById(int id) {
        return MonstruosDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        MonstruosDAO.deleteById(id);
    }

    @Override
    public Monstruos save(Monstruos c) {
        return MonstruosDAO.save(c);
    }
}
