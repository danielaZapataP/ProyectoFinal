package com.example.OPM.controlador;


import com.example.OPM.entity.Batallas;
import com.example.OPM.services.IBatallasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batallas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class BatallasControlador {
    @Autowired
    private IBatallasService Batallaservice;

    @GetMapping("/")
    public List<Batallas> findAll() {
        return  Batallaservice.findAll();
    }

    @GetMapping("/{id}")
    public Batallas findById(@PathVariable int id) {
        return Batallaservice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        Batallaservice.delete(id);
    }

    @PostMapping("/")
    public Batallas create(@RequestBody Batallas c) {
        return Batallaservice.save(c);
    }

    @PutMapping("/{id}")
    public Batallas update (@PathVariable int id,@RequestBody Batallas c) {
        Batallas actual = Batallaservice.findById(id).orElse(null);
        actual.setIdHeroe(c.getIdHeroe());
        actual.setIdMonstruo(c.getIdMonstruo());
        actual.setGanador(c.getGanador());
        return Batallaservice.save(actual);
    }
}
