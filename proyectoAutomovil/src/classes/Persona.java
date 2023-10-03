package classes;

public class Persona {
    private String nombre;
    private String appellido;

    public Persona(String nombre, String appellido) {
        this.nombre = nombre;
        this.appellido = appellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", appellido='" + appellido + '\'' +
                '}';
    }
}
