package entities;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgada = pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return Math.round(this.getPrecio()*1.13);
    }

    @Override
    public String toString() {
        return "TV LCD{" +
                "  Fabricante='" + getFabricante() + '\'' +
                ", tamanio pulgadas='" + pulgada + '\'' +
                ", precio='" + getPrecio() + '\'' +
                ", precio venta='" + getPrecioVenta() + '\'' +
                '}';
    }
}
