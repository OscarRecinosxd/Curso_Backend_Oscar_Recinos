package org.java.oscarrecinos.repositorio.articulo;

import org.java.oscarrecinos.modelo.Articulo;
import org.java.oscarrecinos.modelo.Cliente;
import org.java.oscarrecinos.repositorio.Direccion;
import org.java.oscarrecinos.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ArticuloListRepositorio implements articuloCrudRepositorio {
    private List<Articulo> articulosDb;


    public ArticuloListRepositorio() {
        this.articulosDb = new ArrayList<>();
    }


    @Override
    public List<Articulo> listar() {
        return articulosDb;
    }

    @Override
    public Articulo porId(Integer id) {
        Articulo articulo = null;
        for (Articulo art : articulosDb) {
            if (art.getId() != null && art.getId().equals(id)) {
                articulo = art;
                break;
            }
        }
        return articulo;
    }

    @Override
    public void crear(Articulo newArticulo) {
        articulosDb.add(newArticulo);
    }

    @Override
    public void editar(Articulo editedArticulo) {
        Articulo articulo = porId(editedArticulo.getId());
        articulo.setTitulo(editedArticulo.getTitulo());
        articulo.setEditorial(editedArticulo.getEditorial());
    }

    @Override
    public void eliminar(Integer id) {
        articulosDb.remove(porId(id));
    }
}