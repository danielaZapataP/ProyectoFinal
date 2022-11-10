package com.example.OPM.services;

import com.example.OPM.entity.Fans;

import java.util.List;
import java.util.Optional;

public interface IFansService {
    public List<Fans> findAll();
    public Optional<Fans> findById(int id);
    public void delete(int id);
    public Fans save(Fans c);
}
