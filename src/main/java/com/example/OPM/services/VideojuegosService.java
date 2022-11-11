package com.example.OPM.services;

import com.example.OPM.dao.IVideojuegosDAO;
import com.example.OPM.entity.Videojuegos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VideojuegosService implements IVideojuegosService{
    private IVideojuegosDAO VideojuegosDAO;
    @Override
    public List<Videojuegos> findAll() {
        return VideojuegosDAO.findAll();
    }

    @Override
    public Optional<Videojuegos> findById(int id) {
        return VideojuegosDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        VideojuegosDAO.deleteById(id);
    }

    @Override
    public Videojuegos save(Videojuegos c) {
        return VideojuegosDAO.save(c);
    }
}
