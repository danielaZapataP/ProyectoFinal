package com.example.OPM.controlador;

import com.example.OPM.entity.Videojuegos;
import com.example.OPM.services.IVideojuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videojuegos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class VideojuegosControlador {

    @Autowired
    private IVideojuegosService Videojuegoservice;

    @GetMapping("/")
    public List<Videojuegos> findAll() {
        return  Videojuegoservice.findAll();
    }

    @GetMapping("/{id}")
    public Videojuegos findById(@PathVariable int id) {
        return Videojuegoservice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        Videojuegoservice.delete(id);
    }

    @PostMapping("/")
    public Videojuegos create(@RequestBody Videojuegos c) {
        return Videojuegoservice.save(c);
    }

    @PutMapping("/{id}")
    public Videojuegos update (@PathVariable int id,@RequestBody Videojuegos c) {
        Videojuegos actual = Videojuegoservice.findById(id).orElse(null);
        actual.setNombre(c.getNombre());
        return Videojuegoservice.save(actual);
    }
}
