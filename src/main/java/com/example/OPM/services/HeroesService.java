package com.example.OPM.services;

import com.example.OPM.dao.IHeroesDAO;
import com.example.OPM.entity.Heroes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HeroesService implements IHeroesService{
    @Autowired
    private IHeroesDAO HeroesDAO;

    public List<Heroes> findTop() {
        return HeroesDAO.findTop10ByOrderByRangoDesc();
    }
    @Override
    public List<Heroes> findAll() {
        return HeroesDAO.findAll();
    }

    @Override
    public Optional<Heroes> findById(int id) {
        return HeroesDAO.findById(id);
    }

    @Override
    public void delete(int id) {
        HeroesDAO.deleteById(id);
    }

    @Override
    public Heroes save(Heroes c) {
        return HeroesDAO.save(c);
    }
}
