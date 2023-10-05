package org.java.oscarrecinos.interfaces.repositorio;

import org.java.oscarrecinos.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);

}
