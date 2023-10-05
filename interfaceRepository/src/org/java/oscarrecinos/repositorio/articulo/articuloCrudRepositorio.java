package org.java.oscarrecinos.repositorio.articulo;

import org.java.oscarrecinos.modelo.Articulo;
import org.java.oscarrecinos.modelo.Cliente;

import java.util.List;

public interface articuloCrudRepositorio {
    List<Articulo> listar();
    Articulo porId(Integer id);
    void crear(Articulo newArticulo);
    void editar(Articulo editedArticulo);
    void eliminar(Integer id);
}
