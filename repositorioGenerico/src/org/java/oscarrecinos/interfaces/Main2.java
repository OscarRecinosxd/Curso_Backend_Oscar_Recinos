package org.java.oscarrecinos.interfaces;

import org.java.oscarrecinos.interfaces.modelo.Producto;
import org.java.oscarrecinos.interfaces.repositorio.Direccion;
import org.java.oscarrecinos.interfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.java.oscarrecinos.interfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Delicioso chocolate",7.99));
        repo.crear(new Producto("Ciruelas",15.0));
        repo.crear(new Producto("Fresas",10.0));
        repo.crear(new Producto("Arandanos",2.99));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);
        System.out.println("==========Paginable===========");
        List<Producto> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);

        System.out.println("===========Ordenar=============");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        for (Producto c : productosOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("============editar=============");
        Producto ciruelasActualizar = new Producto("CIRUELAS",23.0);
        ciruelasActualizar.setId(2);
        repo.editar(ciruelasActualizar);
        Producto ciruelas = repo.porId(2);
        System.out.println(ciruelas);
        System.out.println("=============");
        repo.listar("precio",Direccion.ASC).forEach(System.out::println);
        System.out.println("===========Eliminar============");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("============total================");
        System.out.println("Total registros: "+ repo.total());

    }
}
