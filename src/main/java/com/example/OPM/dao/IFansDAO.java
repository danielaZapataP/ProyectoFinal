package com.example.OPM.dao;

import com.example.OPM.entity.Fans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFansDAO extends JpaRepository<Fans, Integer> {
}
