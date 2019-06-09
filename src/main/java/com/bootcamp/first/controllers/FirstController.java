/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.first.controllers;

import com.bootcamp.first.model.Trainer;
import com.bootcamp.first.repos.TrainerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Makis
 */
@Controller
public class FirstController {
    
    @Autowired
    TrainerRepo repo;

    @RequestMapping("insert")
    public String test() {
        return "second";
    }
    
    @RequestMapping("/insertTrainer")
    public String insert(Trainer trainer) {
        repo.save(trainer);
        return "home";
    }
    @RequestMapping("delete")
    public String del() {
        return "deletion";
    }
    
    @RequestMapping("/deleteTrainer")
    public String delete(int idtrainer) {
        repo.deleteById(idtrainer);
        return "home";
    }
    @RequestMapping("update")
    public String update() {
        return "upd";
    }
    
    @RequestMapping("/updateTrainer")
    public String update(Trainer t) {
        repo.save(t);
        return "home";
    }
    @RequestMapping("viewAll")
    public String view() {
        List l = repo.findAll();
        return "seeall";
    }
    
    @RequestMapping("/viewTrainers")
    public List<Trainer> viewAll() {
        List l = repo.findAll();
        return l;
    }
    
//    @RequestMapping("/seeAll")
//    public String viewAll(Trainer trainer) {
//        repo.findAll();
//        return "first";
//    }
//    
//    Article obj = articleRepository.findById(articleId).get();
//Iterable<Article> articles = articleRepository.findAll(); 

}
