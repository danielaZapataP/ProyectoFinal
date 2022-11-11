package com.example.OPM.controlador;

import com.example.OPM.entity.Comida;
import com.example.OPM.services.IComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comida")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ComidaControlador {
    @Autowired
    private IComidaService Comidaervice;

    @GetMapping("/")
    public List<Comida> findAll() {
        return  Comidaervice.findAll();
    }

    @GetMapping("/{id}")
    public Comida findById(@PathVariable int id) {
        return Comidaervice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        Comidaervice.delete(id);
    }

    @PostMapping("/")
    public Comida create(@RequestBody Comida c) {
        return Comidaervice.save(c);
    }

    @PutMapping("/{id}")
    public Comida update (@PathVariable int id,@RequestBody Comida c) {
        Comida actual = Comidaervice.findById(id).orElse(null);
        actual.setDescripcion(c.getDescripcion());
        actual.setPrecio(c.getPrecio());
        return Comidaervice.save(actual);
    }
}
