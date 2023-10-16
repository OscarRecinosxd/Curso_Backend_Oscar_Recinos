package com.oscarrecinos.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/params")
public class EjemploParams {
    @GetMapping("/")
    public String index(){
        return "params/index";
    }
    @GetMapping("mix-params")
    public String params(@RequestParam String saludo, @RequestParam Integer numero, Model model){
        model.addAttribute("resultado",
                "El saludo enviado es:" + saludo + " y el numero es " + numero);
        return "params/ver";
    }
    @GetMapping("/{name}")
    @ResponseBody
    public String as(@PathVariable String name){
        return "Que onda " + name;
    }

    @GetMapping("/persona")
    public String dui(@RequestParam String fecha, @RequestParam Integer edad, Model model){
        model.addAttribute("resultado",
                "La fecha es:" + fecha + " y la edad es " + edad);
        return "persona";
    }
}
