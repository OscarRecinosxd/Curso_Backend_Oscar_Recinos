package org.java.oscarrecinos.interfaces.repositorio;

import org.java.oscarrecinos.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
