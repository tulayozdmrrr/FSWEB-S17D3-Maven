package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Koala;
import com.workintech.zoo.exceptions.ZooException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
    private Map<Integer, Koala> koalas;

    @PostConstruct
    public void init() {
        this.koalas = new HashMap<>();
    }

    @GetMapping
    public List<Koala> find() {
        return koalas.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Koala find(@PathVariable("id") Integer id) {

        return koalas.get(id);
    }

    @PostMapping
    public Koala save(@RequestBody Koala koala) {
        koalas.put((int) koala.getId(), koala);
        return koalas.get(koala.getId());
    }

    @PutMapping("/{id}")
    public Koala update(@PathVariable Integer id, @RequestBody Koala koala) {

        koala.setId(id);
       if(koalas.containsKey(id)){
           koalas.put(id,koala);
           return koalas.get(koala.getId());
       }
       else{
           return save(koala);
       }
    }

    @DeleteMapping("/{id}")
    public Koala remove(@PathVariable Integer id) {
        if (!koalas.containsKey(id)) {
            throw new ZooException("ID'si " + id + " olan Koala bulunamadığı için silme işlemi yapılamadı.", HttpStatus.NOT_FOUND);
        }
        return koalas.remove(id);
    }
}