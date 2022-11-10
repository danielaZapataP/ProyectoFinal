package com.example.OPM.dao;

import com.example.OPM.entity.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComidaDAO extends JpaRepository<Comida, Integer> {
}
