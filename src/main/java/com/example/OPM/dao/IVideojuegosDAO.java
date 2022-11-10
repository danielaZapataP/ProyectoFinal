package com.example.OPM.dao;

import com.example.OPM.entity.Videojuegos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideojuegosDAO extends JpaRepository<Videojuegos, Integer> {
}
