package org.java.oscarrecinos.modelo;

public class Articulo extends Tabla{
    private Integer id;
    private String titulo;
    private String editorial;

    public Articulo(Integer id, String titulo, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}