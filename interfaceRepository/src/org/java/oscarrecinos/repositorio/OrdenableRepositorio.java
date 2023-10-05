package org.java.oscarrecinos.repositorio;

import org.java.oscarrecinos.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
