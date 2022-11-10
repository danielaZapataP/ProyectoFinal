package com.example.OPM.services;

import com.example.OPM.dao.IComidaDAO;
import com.example.OPM.entity.Comida;

import java.util.List;
import java.util.Optional;

public class ComidaService implements IComidaService{
    private IComidaDAO ComidaDAO;
    @Override
    public List<Comida> findAll() {
        return ComidaDAO.findAll();
    }

    @Override
    public Optional<Comida> findById(int id) {
        return ComidaDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        ComidaDAO.deleteById(id);
    }

    @Override
    public Comida save(Comida c) {
        return ComidaDAO.save(c);
    }
}
