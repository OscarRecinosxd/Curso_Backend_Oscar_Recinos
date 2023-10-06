package org.oscarrecinos.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("Uno"));
        System.out.println(hs.add("Dos"));
        System.out.println(hs.add("Tres"));
        System.out.println(hs.add("Cuatro"));
        System.out.println(hs.add("Cinco"));
        System.out.println(hs);

        boolean b = hs.add("Tres");
        System.out.println("permite elementos duplicados = " + b);
        System.out.println(hs);
    }

}
