package com.oscarrecinos.evaluacion3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class FacturaController {

    @GetMapping("/")
    public String crearFactura(){
        return "index";
    }


}
