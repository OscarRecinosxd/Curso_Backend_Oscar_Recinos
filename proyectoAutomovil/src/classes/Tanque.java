package classes;

public class Tanque {
    private int capacidad;

    public Tanque() {
        this.capacidad = 40;
    }

    public Tanque(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "capacidad=" + capacidad +
                '}';
    }
}
