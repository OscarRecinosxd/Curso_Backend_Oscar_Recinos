package model;

import interfaces.AdminInterface;
import util.Lists;

import java.util.Date;
import java.util.List;

public class Admin extends Usuario implements AdminInterface {
    private String contrasena;

    public Admin(String nombre, String contrasena) {
        super(nombre);
        this.contrasena = contrasena;
    }
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public List<Pelicula> anadirRegistrosPeliculas(Pelicula p) {
        Lists.peliculas.add(p);
        return Lists.peliculas;
    }

    @Override
    public List<Pelicula> actualizarRegistrosPeliculas(Pelicula p, String nombrePelicula,String lugar) {
        int i = Lists.peliculas.indexOf(p);
        p.setNombreDePelicula(nombrePelicula);
        p.setLugar(lugar);
        Lists.peliculas.set(i,p);
        return Lists.peliculas;
    }

    @Override
    public List<Pelicula> eliminarRegistrosPeliculas() {
        Lists.peliculas.remove(0);
        return Lists.peliculas;
    }

}
