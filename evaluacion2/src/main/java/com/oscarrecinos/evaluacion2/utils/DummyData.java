package com.oscarrecinos.evaluacion2.utils;

import com.oscarrecinos.evaluacion2.model.*;
import com.oscarrecinos.evaluacion2.repository.FacturaRepository;

import java.util.Arrays;

public class DummyData {
    public static void agregarFacturas(){
        Cliente clienteOscar = new Cliente("Oscar");
        Cliente clienteMiguel = new Cliente("Miguel");

        Producto pastaDeDientes = new Producto("Pasta de dientes",
                4.99f, Categorias.CUIDADO_BUCAL);

        Producto hiloDental = new Producto("Hilo dental",
                1.99f,Categorias.CUIDADO_BUCAL);

        Producto desodorante = new Producto("Desodorante",
                4.95f,Categorias.CUIDADO_CORPORAL);

        Producto bloqueador = new Producto("Bloqueador solar",
                15.00f,Categorias.CUIDADO_CORPORAL);

        ItemFactura item1 = new ItemFactura(pastaDeDientes,1);
        ItemFactura item2 = new ItemFactura(hiloDental,1);
        ItemFactura item3 = new ItemFactura(desodorante,1);
        ItemFactura item4 = new ItemFactura(bloqueador,1);

        ItemFactura itemMiguel1 = new ItemFactura(pastaDeDientes,1);
        ItemFactura itemMiguel2 = new ItemFactura(hiloDental,2);
        ItemFactura itemMiguel3 = new ItemFactura(desodorante,3);
        ItemFactura itemMiguel4 = new ItemFactura(bloqueador,4);

        Factura facturaOscar = new Factura("Factura de Oscar :",clienteOscar);
        facturaOscar.setItems(Arrays.asList(item1,item2,item3,item4));


        Factura facturaMiguel = new Factura("Factura de Miguel :",clienteMiguel);
        facturaMiguel.setItems(Arrays.asList(itemMiguel1,itemMiguel2,itemMiguel3,itemMiguel4));

        FacturaRepository.facturasGuardadas.add(facturaOscar);
        FacturaRepository.facturasGuardadas.add(facturaMiguel);


    }
}
