package org.java.oscarrecinos.interfaces.repositorio;

import org.java.oscarrecinos.interfaces.modelo.BaseEntity;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,PaginableRepositorio<T>,
        CrudRepositorio<T>,ContableRepositorio{
    void crear(T t);
}
