package com.example.OPM.controlador;

import com.example.OPM.entity.Patrocinadores;
import com.example.OPM.services.IPatrocinadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patrocinadores")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PatrocinadoresControlador {

    @Autowired
    private IPatrocinadoresService Patrocinadoreservice;

    @GetMapping("/")
    public List<Patrocinadores> findAll() {
        return  Patrocinadoreservice.findAll();
    }

    @GetMapping("/{id}")
    public Patrocinadores findById(@PathVariable int id) {
        return Patrocinadoreservice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        Patrocinadoreservice.delete(id);
    }

    @PostMapping("/")
    public Patrocinadores create(@RequestBody Patrocinadores c) {
        return Patrocinadoreservice.save(c);
    }

    @PutMapping("/{id}")
    public Patrocinadores update (@PathVariable int id,@RequestBody Patrocinadores c) {
        Patrocinadores actual = Patrocinadoreservice.findById(id).orElse(null);
        actual.setNombre(c.getNombre());
        actual.setDocumentoPatrocinador(c.getDocumentoPatrocinador());
        return Patrocinadoreservice.save(actual);
    }
}
