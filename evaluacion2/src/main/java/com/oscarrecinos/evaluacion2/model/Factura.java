package com.oscarrecinos.evaluacion2.model;

import jakarta.annotation.PostConstruct;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Factura implements Serializable {
    private String descripcion;
    private  Cliente cliente;
    private List<ItemFactura> items;

    public Factura() {
        this.items = new ArrayList<>();
    }

    public Factura(String descripcion, Cliente cliente) {
        super();
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Factura{" +
                descripcion + '\'' +
                ", items=" + items +
                '}';
    }
}
