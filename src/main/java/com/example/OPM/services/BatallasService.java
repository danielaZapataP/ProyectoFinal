package com.example.OPM.services;

import com.example.OPM.dao.IBatallasDAO;
import com.example.OPM.entity.Batallas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatallasService implements IBatallasService{
    @Autowired
    private IBatallasDAO batallasDAO;
    @Override
    public List<Batallas> findAll() {
        return batallasDAO.findAll();
    }

    @Override
    public Optional<Batallas> findById(int id) {
        return batallasDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        batallasDAO.deleteById(id);
    }

    @Override
    public Batallas save(Batallas c) {
        return batallasDAO.save(c);
    }
}
