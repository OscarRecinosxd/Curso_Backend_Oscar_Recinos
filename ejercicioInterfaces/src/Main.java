import entities.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new IPhone(749,"Apple","Iphone 15","Gris espacial"));
        productos.add(new TvLcd(499,"LG",48));
        productos.add(new Libro(7, new Date(),"Steve jobs",
                "How I created the Iphone","Universal"));
        productos.add(new Comics(20,new Date(),"Gege",
                "Jujutsu","National","Gojou Satoru"));


        productos.forEach(producto -> {
            System.out.println(producto.toString());
            System.out.println();
            }
        );

    }
}