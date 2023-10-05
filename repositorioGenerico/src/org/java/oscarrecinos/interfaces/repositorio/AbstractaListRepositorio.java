package org.java.oscarrecinos.interfaces.repositorio;

import org.java.oscarrecinos.interfaces.modelo.BaseEntity;
import org.java.oscarrecinos.interfaces.repositorio.Direccion;
import org.java.oscarrecinos.interfaces.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {
    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public int total() {
        return dataSource.size();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) {
        T resultado = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }
    
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }
}
