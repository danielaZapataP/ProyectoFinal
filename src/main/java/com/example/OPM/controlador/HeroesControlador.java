package com.example.OPM.controlador;

import com.example.OPM.entity.Heroes;
import com.example.OPM.services.IHeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class HeroesControlador {
    @Autowired
    private IHeroesService heroeService;

    @GetMapping("/")
    public List<Heroes> findAll() {
        return  heroeService.findAll();
    }

    @GetMapping("/{id}")
    public Heroes findById(@PathVariable int id) {
        return heroeService.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        heroeService.delete(id);
    }

    @PostMapping("/")
    public Heroes create(@RequestBody Heroes c) {
        return heroeService.save(c);
    }

    @PutMapping("/{id}")
    public Heroes update (@PathVariable int id,@RequestBody Heroes c) {
        Heroes actual = heroeService.findById(id).orElse(null);
        actual.setDocumentoHeroe(c.getDocumentoHeroe());
        actual.setRango(c.getRango());
        actual.setHabilidad(c.getHabilidad());
        actual.setLugarResidencia(c.getLugarResidencia());
        actual.setBatallas(c.getBatallas());
        actual.setPatrocinadoresHList(c.getPatrocinadoresHList());
        actual.setNombre(c.getNombre());
        actual.setTelefono(c.getTelefono());
        return heroeService.save(actual);
    }
}
