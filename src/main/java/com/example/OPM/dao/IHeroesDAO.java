package com.example.OPM.dao;

import com.example.OPM.entity.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IHeroesDAO extends JpaRepository<Heroes, Integer> {

    public List<Heroes> findTop10ByOrderByRangoDesc();

}
