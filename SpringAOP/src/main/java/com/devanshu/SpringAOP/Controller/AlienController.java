package com.devanshu.SpringAOP.Controller;



import com.devanshu.SpringAOP.Model.Alien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AlienController {

    @Autowired
    com.devanshu.SpringREST.Repository.AlienRepo repo;

    @GetMapping(path = "aliens" , produces = {"application/xml"})
    @ResponseBody
    public List<Alien> getAliens(){
        List<Alien> aliens = repo.findAll();
        return aliens;
    }

    @GetMapping("alien/{aid}")
    @ResponseBody
    public Alien getAlien(@PathVariable("aid") int aid){
        Alien alien = repo.findById(aid).orElse(new Alien(0 , ""));
        return alien;
    }

    @PostMapping("alien")
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }
}
