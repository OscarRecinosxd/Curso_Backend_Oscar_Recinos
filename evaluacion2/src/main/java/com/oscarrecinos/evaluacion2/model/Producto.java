package com.oscarrecinos.evaluacion2.model;

public class Producto {
    private String nombre;
    private float precio;
    private Categorias categoriaa;

    public Producto(String nombre, float precio, Categorias categoriaa) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoriaa = categoriaa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Categorias getCategoriaa() {
        return categoriaa;
    }

    public void setCategoriaa(Categorias categoriaa) {
        this.categoriaa = categoriaa;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
