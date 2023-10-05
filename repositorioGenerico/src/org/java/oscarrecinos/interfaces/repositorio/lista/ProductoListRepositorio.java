package org.java.oscarrecinos.interfaces.repositorio.lista;

import org.java.oscarrecinos.interfaces.modelo.Producto;
import org.java.oscarrecinos.interfaces.repositorio.AbstractaListRepositorio;
import org.java.oscarrecinos.interfaces.repositorio.Direccion;

import java.util.List;


public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {


    @Override
    public void editar(Producto producto) {
        Producto p = porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        return null;
    }

}
