import classes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {

    public static void main(String[] args){
        Persona conductorSubaru = new Persona("Oscar","Recinos");
        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato","Rodriguez");
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,motorMazda);
        mazda.setTanque(new Tanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(pato);


        Persona bea = new Persona("Bea","Gonzales");
        Automovil nissan = new Automovil("Nissan","Navara",
                Color.GRIS,new Motor(4.0,TipoMotor.DIESEL), new Tanque(50));

        nissan.setConductor(bea);


        Persona patricio = new Persona("Patricio","Estrella");
        Automovil nissan2 = new Automovil("Nissan","Navara",
                Color.GRIS,new Motor(3.5,TipoMotor.GASOLINA), new Tanque(50));
        nissan2.setConductor(patricio);

        Automovil susuzi = new Automovil("Suzuki","D4",
                Color.GRIS,new Motor(3.6,TipoMotor.DIESEL));

        List<Automovil> autos = new ArrayList<>(Arrays.asList(subaru,mazda,nissan,nissan2,susuzi));
        System.out.println("--------------------------------------------------------------");
        autos.forEach(Ejemplo2::imprimirDetalle);


    }

    public static void imprimirDetalle(Automovil auto){
        switch (auto.getFabricante()){
            case "Subaru" -> System.out.println("Auto subaru");
            case "Mazda" ->  System.out.println("Auto Mazda");
            case "Nissan" -> System.out.println("Auto Nissan");
            case "Susuzi" -> System.out.println("Auto Susuzi");
        }

        System.out.println(auto.verDetalle());
        if (auto.getMotor()!=null){
            System.out.println(auto.getMotor().toString());
        }
        if (auto.getConductor()!=null){
            System.out.println(auto.getConductor().toString());
        }
        if(auto.getTanque()!=null){
            System.out.println(auto.getTanque().toString());
        }
        if(auto.getRuedas() !=null){
            System.out.println(auto.getRuedas().toString());
        }
        System.out.println("-------------------------------------------------------");
    }
}
