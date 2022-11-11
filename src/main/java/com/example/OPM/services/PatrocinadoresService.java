package com.example.OPM.services;

import com.example.OPM.dao.IPatrocinadoresDAO;
import com.example.OPM.entity.Patrocinadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PatrocinadoresService implements IPatrocinadoresService{
    @Autowired
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
