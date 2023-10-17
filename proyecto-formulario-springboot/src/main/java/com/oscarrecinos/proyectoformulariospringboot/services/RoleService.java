package com.oscarrecinos.proyectoformulariospringboot.services;

import com.oscarrecinos.proyectoformulariospringboot.models.domain.Role;

import java.util.List;


public interface RoleService {
	
	public List<Role> listar();
	public Role obtenerPorId(Integer id);

}
