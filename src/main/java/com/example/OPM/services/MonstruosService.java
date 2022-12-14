package com.example.OPM.services;

import com.example.OPM.dao.IMonstruosDAO;
import com.example.OPM.entity.Monstruos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MonstruosService implements IMonstruosService{
    @Autowired
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
