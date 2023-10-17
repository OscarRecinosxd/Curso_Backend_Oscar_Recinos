package com.oscarrecinos.springboot_mvc;

import com.oscarrecinos.springboot_mvc.model.domain.ItemFactura;
import com.oscarrecinos.springboot_mvc.model.domain.Producto;
import com.oscarrecinos.springboot_mvc.model.service.IServicio;
import com.oscarrecinos.springboot_mvc.model.service.MiServicio;
import com.oscarrecinos.springboot_mvc.model.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara sony",100);
        Producto producto2 = new Producto("Bicicleta bianchi aro 26",200);

        ItemFactura linea1 = new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto1,4);

        return Arrays.asList(linea1,linea2);
    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG LCD 24",250);
        Producto producto2 = new Producto("Notebook Asus",500);
        Producto producto3 = new Producto("Impresora HP multifuncinal",80);
        Producto producto4 = new Producto("Escritorio Oficina",300);

        ItemFactura linea1 = new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2,1);
        ItemFactura linea3 = new ItemFactura(producto3,1);
        ItemFactura linea4 = new ItemFactura(producto4,1);
        return Arrays.asList(linea1,linea2,linea3,linea4);
    }

}
