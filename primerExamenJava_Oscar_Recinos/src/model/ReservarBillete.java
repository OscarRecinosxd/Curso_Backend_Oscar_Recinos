package model;

import interfaces.ReservarBilleteInterface;

import java.util.Date;

public class ReservarBillete implements ReservarBilleteInterface {
    private int numeroDeEntradasDisponibles;
    private String nombrePelicula;
    private int MostrarNumero;
    private Date fecha;
    private Date tiempo;
    private String lugar;

    public ReservarBillete(int numeroDeEntradasDisponibles, String nombrePelicula, int mostrarNumero,
                           Date fecha, Date tiempo, String lugar) {
        this.numeroDeEntradasDisponibles = numeroDeEntradasDisponibles;
        this.nombrePelicula = nombrePelicula;
        MostrarNumero = mostrarNumero;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.lugar = lugar;
    }

    public int getNumeroDeEntradasDisponibles() {
        return numeroDeEntradasDisponibles;
    }

    public void setNumeroDeEntradasDisponibles(int numeroDeEntradasDisponibles) {
        this.numeroDeEntradasDisponibles = numeroDeEntradasDisponibles;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getMostrarNumero() {
        return MostrarNumero;
    }

    public void setMostrarNumero(int mostrarNumero) {
        MostrarNumero = mostrarNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public void actualizarAsientosDisponibles() {
        this.numeroDeEntradasDisponibles--;
        System.out.println("Se actualizaron los asientos disponibles a " + this.numeroDeEntradasDisponibles);
    }

    @Override
    public String toString() {
        return "ReservarBillete{" +
                "nombrePelicula='" + nombrePelicula + '\'' +
                ", MostrarNumero=" + MostrarNumero +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
