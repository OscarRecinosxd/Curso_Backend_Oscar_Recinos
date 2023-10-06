package org.oscarrecinos.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicados {
    public static void main(String[] args) {
        String[] peces = {"Corvina" , "Lenguado", "Pejerrey","Robalo","Atun","Lenguado","Atun"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez : peces) {
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }

        System.out.println(unicos.size() + " Elementos no duplicados: " + unicos);
        System.out.println(duplicados.size() + " Elementos duplicados: " + duplicados);
    }
}
