package com.oscarrecinos.springboot_mvc.model.service;

import org.springframework.stereotype.Service;

public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "Implementando servicio complicado";
    }
}
