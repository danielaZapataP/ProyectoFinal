package com.example.OPM.controlador;

import com.example.OPM.entity.CasaSaitama;
import com.example.OPM.services.ICasaSaitamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casasaitama")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CasaSaitamaControlador {
    @Autowired
    private ICasaSaitamaService CasaSaitamaervice;

    @GetMapping("/")
    public List<CasaSaitama> findAll() {
        return  CasaSaitamaervice.findAll();
    }

    @GetMapping("/{id}")
    public CasaSaitama findById(@PathVariable int id) {
        return CasaSaitamaervice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        CasaSaitamaervice.delete(id);
    }

    @PostMapping("/")
    public CasaSaitama create(@RequestBody CasaSaitama c) {
        return CasaSaitamaervice.save(c);
    }

    @PutMapping("/{id}")
    public CasaSaitama update (@PathVariable int id,@RequestBody CasaSaitama c) {
        CasaSaitama actual = CasaSaitamaervice.findById(id).orElse(null);
        actual.setGastoTotal(c.getGastoTotal());
        return CasaSaitamaervice.save(actual);
    }
}
