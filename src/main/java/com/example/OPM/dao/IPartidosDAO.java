package com.example.OPM.dao;

import com.example.OPM.entity.Partidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPartidosDAO extends JpaRepository<Partidos, Integer> {
}
