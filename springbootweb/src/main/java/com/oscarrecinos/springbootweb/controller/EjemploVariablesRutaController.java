package com.oscarrecinos.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo","Recibir parametros de la ruta");
        return "variables/ver";
    }

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model){
        model.addAttribute("titulo","Recibir parametros"+
                "de la ruta (@PathVariable)");
        model.addAttribute("resultado","el texto enviado en la ruta" +
                "es :" + texto);

        return "variables/ver";
    }


}
