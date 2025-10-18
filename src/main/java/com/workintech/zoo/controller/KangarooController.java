package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.ZooException;
import com.workintech.zoo.validations.ZooKangrooValidation;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {
    private Map<Integer, Kangaroo> kangaroos;

    @PostConstruct
    public void init() {
        this.kangaroos = new HashMap<>();
    }

    @GetMapping
    public List<Kangaroo> find() {
        return this.kangaroos.values().stream().toList();

    }

    @GetMapping("/{id}")
    public Kangaroo find(@PathVariable ("id") Integer id) {
     ZooKangrooValidation.isIdValid(id);
     ZooKangrooValidation.chechKangrooExistence(kangaroos,id,true);
     return kangaroos.get(id);
    }
    @PostMapping
    public  Kangaroo save(@RequestBody Kangaroo kangaroo){
        ZooKangrooValidation.chechKangrooExistence(kangaroos, (int) kangaroo.getId(),false);
        ZooKangrooValidation.chechKangarooWeight(kangaroo.getWeight());
        kangaroos.put((int) kangaroo.getId(),kangaroo);
        return kangaroos.get(kangaroo.getId());

    }

    @PutMapping
    public Kangaroo update (@PathVariable int id,@RequestBody Kangaroo kangaroo){
        ZooKangrooValidation.isIdValid(id);
        ZooKangrooValidation.chechKangarooWeight(kangaroo.getWeight());
        kangaroo.setId(id);
        if(kangaroos.containsKey(id)){
            kangaroos.put(id,kangaroo);
            return kangaroos.get(id);
        }
        else {
            return save(kangaroo);
        }
    }
@DeleteMapping("/{id}")
    public Kangaroo delete(@PathVariable Integer id){
        ZooKangrooValidation.isIdValid(id);
        ZooKangrooValidation.chechKangrooExistence(kangaroos,id,true);
        return kangaroos.remove(id);
}


}