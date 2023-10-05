package org.java.oscarrecinos.interfaces.repositorio;


import org.java.oscarrecinos.interfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}