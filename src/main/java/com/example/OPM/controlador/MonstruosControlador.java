package com.example.OPM.controlador;

import com.example.OPM.entity.Monstruos;
import com.example.OPM.entity.Monstruos;
import com.example.OPM.services.IMonstruosService;
import com.example.OPM.services.IMonstruosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monstruos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class MonstruosControlador {

    @Autowired
    private IMonstruosService monstruoService;

    @GetMapping("/")
    public List<Monstruos> findAll() {
        return  monstruoService.findAll();
    }

    @GetMapping("/{id}")
    public Monstruos findById(@PathVariable int id) {
        return monstruoService.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        monstruoService.delete(id);
    }

    @PostMapping("/")
    public Monstruos create(@RequestBody Monstruos c) {
        return monstruoService.save(c);
    }

    @PutMapping("/{id}")
    public Monstruos update (@PathVariable int id,@RequestBody Monstruos c) {
        Monstruos actual = monstruoService.findById(id).orElse(null);
        actual.setBatallas(c.getBatallas());
        actual.setPatrocinadoresMList(c.getPatrocinadoresMList());
        actual.setNombre(c.getNombre());
        actual.setNivelAmenaza(c.getNivelAmenaza());
        return monstruoService.save(actual);
    }
}
