package org.oscarrecinos.ejemplos.list;

import org.oscarrecinos.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> as = new LinkedList<>();
        as.add(new Alumno("Pato",5));
        as.add(new Alumno("Cata",6));
        as.add(new Alumno("Luci",4));
        as.add(new Alumno("Jano",7));
        as.add(new Alumno("Andres",3));
        as.add(new Alumno("Zeus2",2));
        as.add(new Alumno("Zeus",2));
        as.add(new Alumno("Lucas",2));
        as.add(new Alumno("Lucas",3));

        as.sort(comparing(Alumno::getNombre).reversed());
        System.out.println(as);
        System.out.println("Iterando usando Stream forEach");
        as.forEach(System.out::println);

    }
}
