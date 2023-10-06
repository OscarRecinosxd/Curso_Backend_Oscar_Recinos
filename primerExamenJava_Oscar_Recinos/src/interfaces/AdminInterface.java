package interfaces;

import model.Pelicula;

import java.util.List;

public interface AdminInterface {
    List<Pelicula> anadirRegistrosPeliculas(Pelicula p);
    List<Pelicula> actualizarRegistrosPeliculas(Pelicula p,String nombre,String lugar);
    List<Pelicula> eliminarRegistrosPeliculas();
}
