package com.oscarrecinos.springboot_mvc.model.service;

import org.springframework.stereotype.Service;

public class MiServicio implements IServicio{

    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante simple";
    }
}
