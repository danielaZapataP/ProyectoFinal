package com.example.OPM.controlador;

import com.example.OPM.entity.CelulasM;
import com.example.OPM.services.ICelulasMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CelulasM")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CelulasMControlador {
    @Autowired
    private ICelulasMService CelulasMervice;

    @GetMapping("/")
    public List<CelulasM> findAll() {
        return  CelulasMervice.findAll();
    }

    @GetMapping("/{id}")
    public CelulasM findById(@PathVariable int id) {
        return CelulasMervice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        CelulasMervice.delete(id);
    }

    @PostMapping("/")
    public CelulasM create(@RequestBody CelulasM c) {
        return CelulasMervice.save(c);
    }

    @PutMapping("/{id}")
    public CelulasM update (@PathVariable int id,@RequestBody CelulasM c) {
        CelulasM actual = CelulasMervice.findById(id).orElse(null);
        actual.setDocumentoHeroe(c.getDocumentoHeroe());
        actual.setDescripcion(c.getDescripcion());
        actual.setIdMonstruo(c.getIdMonstruo());
        return CelulasMervice.save(actual);
    }
}
