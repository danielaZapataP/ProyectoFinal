package com.example.OPM.dao;

import com.example.OPM.entity.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHeroesDAO extends JpaRepository<Heroes, Integer> {
}
