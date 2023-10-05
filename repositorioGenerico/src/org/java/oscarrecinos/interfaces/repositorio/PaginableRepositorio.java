package org.java.oscarrecinos.interfaces.repositorio;

import org.java.oscarrecinos.interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
