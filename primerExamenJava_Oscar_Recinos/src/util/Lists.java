package util;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lists {
    public static List<UsuarioRegistrado> usuarios = new ArrayList<>();
    public static List<Visitante> visitantes= new ArrayList<>();
    public static List<Pelicula> peliculas= new ArrayList<>();
    public static List<Admin> administradores= new ArrayList<>();
    public static List<ReservarBillete> billetes= new ArrayList<>();
    public static List<RealizarPago> pagosRealizados= new ArrayList<>();

    public static void poblar(){
        usuarios.add(new UsuarioRegistrado("Oscar","1234","A"));
        usuarios.add(new UsuarioRegistrado("Martita","2","B"));
        usuarios.add(new UsuarioRegistrado("Recin","3","C"));
        usuarios.add(new UsuarioRegistrado("Joe","4","D"));
        usuarios.add(new UsuarioRegistrado("Peri","5","E"));

        visitantes.add(new Visitante("Jeni"));
        visitantes.add(new Visitante("Jose"));
        visitantes.add(new Visitante("Portillo"));

        peliculas.add(new Pelicula("Saw",new Date(),"Chalate"));
        peliculas.add(new Pelicula("Tiburon",new Date(),"Cusca"));
        peliculas.add(new Pelicula("Megalodon",new Date(),"Soya"));
        /*peliculas.add(new Pelicula("Aladin",new Date(),"Bronx"));
        peliculas.add(new Pelicula("Cinderella",new Date(),"New York"));*/

        administradores.add(new Admin("Admin","1234"));
        administradores.add(new Admin("root","1234"));

        billetes.add(new ReservarBillete(10,peliculas.get(0).getNombreDePelicula(),
                10,new Date(),new Date(),"chalate"));
        billetes.add(new ReservarBillete(10,peliculas.get(1).getNombreDePelicula(),
                20,new Date(),new Date(),"Guatemala"));
        billetes.add(new ReservarBillete(10,peliculas.get(2).getNombreDePelicula(),
                30,new Date(),new Date(),"El Salvador"));

        pagosRealizados.add(new RealizarPago(5.99f,usuarios.get(0).getId()));
        pagosRealizados.add(new RealizarPago(4.50f,usuarios.get(0).getId()));
        pagosRealizados.add(new RealizarPago(3.00f,usuarios.get(0).getId()));
        pagosRealizados.add(new RealizarPago(15.00f,usuarios.get(1).getId()));
        pagosRealizados.add(new RealizarPago(25.00f,usuarios.get(1).getId()));
        pagosRealizados.add(new RealizarPago(5.00f,usuarios.get(1).getId()));



    }
}
