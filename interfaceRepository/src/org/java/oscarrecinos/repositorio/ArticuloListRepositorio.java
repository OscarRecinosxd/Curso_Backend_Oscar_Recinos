package org.java.oscarrecinos.repositorio;

import org.java.oscarrecinos.modelo.Articulo;
import org.java.oscarrecinos.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ArticuloListRepositorio implements OrdenablePaginableCrudRepositorio {
    private List<Articulo> articulosDb;


    public ArticuloListRepositorio() {
        this.articulosDb = new ArrayList<>();
    }

    @Override
    public int total() {
        return articulosDb.size();
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente porId(Integer id) {
        return null;
    }

    @Override
    public void crear(Cliente cliente) {

    }

    @Override
    public void editar(Cliente cliente) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return null;
    }
}