package model;

import interfaces.RealizarPagoInterface;
import interfaces.UsuarioRegistradoInterface;
import util.Lists;

import java.util.Date;
import java.util.Objects;

public class UsuarioRegistrado extends Usuario implements UsuarioRegistradoInterface {
    private String numeroTelefono;
    private String direccion;

    public UsuarioRegistrado(String nombre, String numeroTelefono, String direccion) {
        super(nombre);
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public Pelicula verPelicula(Pelicula p) {
        return p;
    }

    @Override
    public String iniciarSesion(String nombre) {
        return "Iniciaste sesion";
    }

    @Override
    public String cierreSesion() {
        return "Cerraste sesion";
    }

    @Override
    public ReservarBillete reservarBillete(ReservarBillete billete) {
        Lists.billetes.add(billete);
        return billete;
    }

    @Override
    public RealizarPago realizarPago(RealizarPago pago) {
        Lists.pagosRealizados.add(pago);
        return pago;
    }

    @Override
    public String cancelarBillete(){
        return "El billete fue cancelado";
    }
}
