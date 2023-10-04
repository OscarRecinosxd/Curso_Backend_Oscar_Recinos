package entities;

public class IPhone extends Electronico{
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return Math.round(this.getPrecio()*1.13);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "  Fabricante='" + getFabricante() + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio='" + getPrecio() + '\'' +
                ", precio venta='" + getPrecioVenta() + '\'' +
                '}';
    }
}
