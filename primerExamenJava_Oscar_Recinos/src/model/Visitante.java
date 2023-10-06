package model;

import interfaces.VisitanteInterface;
import util.Lists;

import java.util.Scanner;

public class Visitante extends Persona implements VisitanteInterface {
    public Visitante(String nombre) {
        super(nombre);
    }

    @Override
    public Pelicula verPelicula(Pelicula p) {
        return p;
    }

    @Override
    public String registrarse() {
        return "Usuario se ha registrado con exito";
    }

}
