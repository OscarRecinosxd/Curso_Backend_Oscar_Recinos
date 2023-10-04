package entities;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "fechaPublicacion=" + getFechaPublicacion() +
                ", Personajes='" + personaje + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", precio='" + getPrecio() + '\'' +
                ", precio venta='" + getPrecioVenta() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                '}';
    }

}
