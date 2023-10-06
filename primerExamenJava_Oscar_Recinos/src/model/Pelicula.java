package model;

import interfaces.PeliculaInterface;

import java.util.Date;
import java.util.Objects;

public class Pelicula implements PeliculaInterface {
    private String nombreDePelicula;
    private Date peliculaEspectaculo;
    private String lugar;

    public Pelicula(String nombreDePelicula, Date peliculaEspectaculo, String lugar) {
        this.nombreDePelicula = nombreDePelicula;
        this.peliculaEspectaculo = peliculaEspectaculo;
        this.lugar = lugar;
    }

    public String getNombreDePelicula() {
        return nombreDePelicula;
    }

    public void setNombreDePelicula(String nombreDePelicula) {
        this.nombreDePelicula = nombreDePelicula;
    }

    public Date getPeliculaEspectaculo() {
        return peliculaEspectaculo;
    }

    public void setPeliculaEspectaculo(Date peliculaEspectaculo) {
        this.peliculaEspectaculo = peliculaEspectaculo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Pelicula = " + nombreDePelicula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(nombreDePelicula, pelicula.nombreDePelicula) && Objects.equals(lugar, pelicula.lugar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDePelicula, lugar);
    }

    @Override
    public Pelicula detallesActualizacion() {
        return this;
    }
}
