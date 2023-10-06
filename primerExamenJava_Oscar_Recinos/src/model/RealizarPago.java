package model;

import interfaces.RealizarPagoInterface;

public class RealizarPago implements RealizarPagoInterface {
    private int id;
    private float importe;
    private int idTransaccion;
    private int identificadorUsuario;
    private static int ultimoId;
    public RealizarPago(float importe, int identificadorUsuario) {
        this.id = ++ultimoId;
        this.importe = importe;
        ultimoId--;
        this.idTransaccion = ++ultimoId;
        this.identificadorUsuario = identificadorUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public void setIdentificadorUsuario(int identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        RealizarPago.ultimoId = ultimoId;
    }

    @Override
    public boolean confirmarTransaccion() {
        System.out.println("Transaccion aprobada");
        return true;
    }

    @Override
    public float devolucionDineroCasoCancelacion() {
        System.out.println("Se hizo una devolucion de: " + this.importe);
        return this.importe;
    }

    @Override
    public String toString() {
        return "Pago" +
                "id=" + id +
                ", importe=" + importe +
                ", identificadorUsuario=" + identificadorUsuario;
    }
}
