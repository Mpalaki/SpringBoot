/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Makis
 */
@Controller
public class FirstController {

    @RequestMapping("index")
    public String test() {
        System.out.println("controller called.");
        return "second.jsp";
    }

}
