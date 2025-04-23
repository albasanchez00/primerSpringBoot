package com.ceatformacion.primerspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class FirstController {

    @GetMapping("/")
    public String mostrar(Model model) {
        //Generar un dato del lado Servidor y luego mostrarlo en la vista
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(i+(int)(Math.random()*10));
        }
        model.addAttribute("lista", lista);
        model.addAttribute("nombre", "Alba Sánchez");

        return "index";
    }

    @GetMapping("/homer")
    public String mostrarHomer() {
        return "foto";
    }

    @GetMapping("/user")
    public String mostrarFormulario() {
        return "user";
    }

    @PostMapping("/leer-id")
    public String getUser(@RequestParam String id, Model model) {
        model.addAttribute("id", id);
        return "leer-id";
    }


}
