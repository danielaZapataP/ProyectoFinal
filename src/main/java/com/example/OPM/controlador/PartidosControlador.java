package com.example.OPM.controlador;

import com.example.OPM.entity.Partidos;
import com.example.OPM.services.IPartidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PartidosControlador {

    @Autowired
    private IPartidosService Partidoservice;

    @GetMapping("/")
    public List<Partidos> findAll() {
        return  Partidoservice.findAll();
    }

    @GetMapping("/{id}")
    public Partidos findById(@PathVariable int id) {
        return Partidoservice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        Partidoservice.delete(id);
    }

    @PostMapping("/")
    public Partidos create(@RequestBody Partidos c) {
        return Partidoservice.save(c);
    }

    @PutMapping("/{id}")
    public Partidos update (@PathVariable int id,@RequestBody Partidos c) {
        Partidos actual = Partidoservice.findById(id).orElse(null);
        actual.setDescripcion(c.getDescripcion());
        return Partidoservice.save(actual);
    }
}
