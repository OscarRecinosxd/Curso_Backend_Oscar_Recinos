import model.*;
import util.Lists;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Lists.poblar();
        Admin a = Lists.administradores.get(0);
        System.out.println("\n\nPeliculas : " + Lists.peliculas.toString() );
        System.out.println("Administradores : " + Lists.administradores.toString() );
        System.out.println("Visitantes : " + Lists.visitantes.toString());
        System.out.println("Usuarios Registrados : " + Lists.usuarios.toString());
        System.out.println("Billetes reservados : " + Lists.billetes.toString() );
        System.out.println("Pagos Realizados : " + Lists.pagosRealizados.toString());
        System.out.println();

        System.out.println("===================ADMINISTRADORES==============");
        Pelicula p = new Pelicula("Matar o morir",new Date(),"San Jacinto");
        System.out.println("Añadiendo pelicula : 'matar o morir' : " + a.anadirRegistrosPeliculas(p));
        System.out.println("Actualizando pelicula matar o morir a 'the witcher' : "+a.actualizarRegistrosPeliculas(p,
                "The witcher","Lugar de prueba"));
        System.out.println("Eliminando pelicula : 'Saw' "+ a.eliminarRegistrosPeliculas());

        System.out.println();
        System.out.println("===================Visitantes==============");
        Visitante v = Lists.visitantes.get(0);
        System.out.println("Registrarse:" + v.registrarse());
        System.out.println("Viendo: " + v.verPelicula(p).toString());

        System.out.println();
        System.out.println("============Usuario Registrado==============");
        UsuarioRegistrado u = Lists.usuarios.get(0);
        System.out.println("Iniciando sesion: " + u.iniciarSesion(u.getNombre()));
        System.out.println("Cerrando sesion: " + u.cierreSesion());
        System.out.println("Viendo pelicula: " + u.verPelicula(p).toString());
        ReservarBillete billete = new ReservarBillete(10,
                Lists.peliculas.get(0).getNombreDePelicula(),1, new Date(),new Date(),
                "Chalatenango");
        System.out.println("Reservando billete : "+ u.reservarBillete(billete).toString());
        RealizarPago pago = new RealizarPago(7.99f,Lists.usuarios.get(0).getId());
        System.out.println("Realizando pago : " + u.realizarPago(pago).toString());
        System.out.println("Cancelar billete : " + u.cancelarBillete());

        System.out.println();
        System.out.println("============Peliculas==============");
        Pelicula p2 = Lists.peliculas.get(0);
        System.out.println("Detalles actualizacion : " + p2.toString());

        System.out.println();
        System.out.println("============Reservar billete===========");
        ReservarBillete rb = Lists.billetes.get(0);
        rb.actualizarAsientosDisponibles();

        System.out.println();
        System.out.println("============Realizar el pago clase==============");
        RealizarPago rp = Lists.pagosRealizados.get(0);
        System.out.println("Realizando transaccion, confirmacion : "+rp.confirmarTransaccion());
        System.out.println("Devolucion dinero, la devolucion es de : "+rp.devolucionDineroCasoCancelacion());
    }
}