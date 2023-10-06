package model;

public abstract class Usuario extends Persona{
    private int id;
    private static int ultimoId;
    public Usuario(String nombre) {
        super(nombre);
        this.id = ++ultimoId;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                '}';
    }
}
