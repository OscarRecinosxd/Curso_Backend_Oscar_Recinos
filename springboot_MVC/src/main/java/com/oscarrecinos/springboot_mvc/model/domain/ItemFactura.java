package com.oscarrecinos.springboot_mvc.model.domain;

import com.oscarrecinos.springboot_mvc.model.domain.Producto;

public class ItemFactura {
    private Producto producto;
    private Integer cantida;

    public ItemFactura(Producto producto, Integer cantida) {
        this.producto = producto;
        this.cantida = cantida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantida() {
        return cantida;
    }

    public void setCantida(Integer cantida) {
        this.cantida = cantida;
    }
    public Integer calcularImporte() {
        return cantida * producto.getPrecio();
    }

}
