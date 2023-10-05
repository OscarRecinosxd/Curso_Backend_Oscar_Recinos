package org.java.oscarrecinos.repositorio;

import org.java.oscarrecinos.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde,int hasta);
}
