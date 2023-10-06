package interfaces;

import model.Pelicula;
import model.RealizarPago;
import model.ReservarBillete;

public interface UsuarioRegistradoInterface extends UsuarioInterface{
    String iniciarSesion(String nombre);
    String cierreSesion();
    ReservarBillete reservarBillete(ReservarBillete billete);
    RealizarPago realizarPago(RealizarPago pago);
    String cancelarBillete();

}
