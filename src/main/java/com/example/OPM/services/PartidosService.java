package com.example.OPM.services;

import com.example.OPM.dao.IPartidosDAO;
import com.example.OPM.entity.Partidos;

import java.util.List;
import java.util.Optional;

public class PartidosService implements IPartidosService{
    private IPartidosDAO PartidosDAO;
    @Override
    public List<Partidos> findAll() {
        return PartidosDAO.findAll();
    }

    @Override
    public Optional<Partidos> findById(int id) {
        return PartidosDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        PartidosDAO.deleteById(id);
    }

    @Override
    public Partidos save(Partidos c) {
        return PartidosDAO.save(c);
    }
}
