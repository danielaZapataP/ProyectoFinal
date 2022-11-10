package com.example.OPM.services;

import com.example.OPM.dao.IFansDAO;
import com.example.OPM.entity.Fans;

import java.util.List;
import java.util.Optional;

public class FansService implements IFansService{
    private IFansDAO FansDAO;
    @Override
    public List<Fans> findAll() {
        return FansDAO.findAll();
    }

    @Override
    public Optional<Fans> findById(int id) {
        return FansDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        FansDAO.deleteById(id);
    }

    @Override
    public Fans save(Fans c) {
        return FansDAO.save(c);
    }
}
