package com.oscarrecinos.proyectoformulariospringboot.services;

import com.oscarrecinos.proyectoformulariospringboot.models.domain.Pais;

import java.util.List;

public interface PaisService {
    List<Pais> listar();
    Pais obtenerPorId(Integer id);
}
