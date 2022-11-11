package com.example.OPM.controlador;

import com.example.OPM.entity.Fans;
import com.example.OPM.services.IFansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fans")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class FansControlador {

    @Autowired
    private IFansService Fanservice;

    @GetMapping("/")
    public List<Fans> findAll() {
        return  Fanservice.findAll();
    }

    @GetMapping("/{id}")
    public Fans findById(@PathVariable int id) {
        return Fanservice.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable int id) {
        Fanservice.delete(id);
    }

    @PostMapping("/")
    public Fans create(@RequestBody Fans c) {
        return Fanservice.save(c);
    }

    @PutMapping("/{id}")
    public Fans update (@PathVariable int id,@RequestBody Fans c) {
        Fans actual = Fanservice.findById(id).orElse(null);
        actual.setDocumentoFan(c.getDocumentoFan());
        return Fanservice.save(actual);
    }
}
