package com.oscarrecinos.springboot_mvc.model.domain;

import com.oscarrecinos.springboot_mvc.model.ItemFactura;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serializable;
import java.util.List;

@Component
@RequestScope
public class Factura implements Serializable {
    private static final long serialVersionUID = 946004357128146951L;

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;


    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Jose"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destruir(){
        System.out.println("Factura destruida: ".concat(descripcion));
    }
}
