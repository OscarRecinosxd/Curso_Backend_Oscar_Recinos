package org.java.oscarrecinos;

import org.java.oscarrecinos.modelo.Articulo;
import org.java.oscarrecinos.modelo.Cliente;
import org.java.oscarrecinos.repositorio.ClienteListRepositorio;
import org.java.oscarrecinos.repositorio.Direccion;
import org.java.oscarrecinos.repositorio.OrdenablePaginableCrudRepositorio;
import org.java.oscarrecinos.repositorio.articulo.ArticuloListRepositorio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Bea","Gonzales"));
        repo.crear(new Cliente("Luci","Martinez"));
        repo.crear(new Cliente("Andres","Guzman"));
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("=======Paginable=========");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);

        System.out.println("========Ordenar==========");
        List<Cliente> clientesOrdenAsc = repo.listar("Apellido", Direccion.ASC);
        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("=========editar==========");
        Cliente beaActualizar = new Cliente("Bea","Mena");
        beaActualizar.setId(2);
        System.out.println(beaActualizar);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println("================");
        repo.listar("nombre",Direccion.ASC).forEach(System.out::println);
        System.out.println("========eliminar==========");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===========total============");
        System.out.println("Total registros: "+repo.total());
        */

        ArticuloListRepositorio lista = new ArticuloListRepositorio();
        lista.crear(new Articulo(1,"Jujutsu","General"));
        lista.crear(new Articulo(2,"Zero","Mundo"));

        System.out.println("Listar");
        lista.listar().forEach(System.out::println);
        System.out.println("Por id");
        System.out.println(lista.porId(1));
        System.out.println("Borrar");
        lista.eliminar(1);
        System.out.println(lista.listar());
        System.out.println("Editar");
        lista.editar(new Articulo(2,"Editado","Editado"));
        System.out.println(lista.listar());
    }
}