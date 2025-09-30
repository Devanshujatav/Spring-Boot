package com.devanshu.controller;

import com.devanshu.Repository.AlienRepo;
import com.devanshu.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

public class HomeController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @GetMapping("getAliens")
    public String getAliens(Model m){
        m.addAttribute("result" , repo.findAll());

        return "showAliens";
    }

    @GetMapping("GetAliens")
    public String getAlien(@RequestParam int aid , Model m){
        m.addAttribute("result" , repo.getReferenceById(aid));

        return "showAliens";
    }

    @PostMapping(value = "addAlien")
    public String addAlien(@ModelAttribute Alien a){
        repo.save(a);
        return "result";
    }



}