package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);

	public Page<Cliente> findAll(Pageable pageable);
	// What a waste of time these classes
	public void delete(Long id);
	
}
