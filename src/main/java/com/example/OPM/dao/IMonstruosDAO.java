package com.example.OPM.dao;

import com.example.OPM.entity.Monstruos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMonstruosDAO extends JpaRepository<Monstruos, Integer> {
}
