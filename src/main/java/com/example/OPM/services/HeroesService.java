package com.example.OPM.services;

import com.example.OPM.dao.IHeroesDAO;
import com.example.OPM.entity.Heroes;
import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HeroesService implements IHeroesService{
    private IHeroesDAO HeroesDAO;
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
