import model.*;

import static model.Imprimible.TEXTO_DEFECTO;
import static model.Imprimible.imprimir;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John","Doe"),"Ingenieria informatica",
                "Resumen laborar ...");
            cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador FullStack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich","Gamma"),
                "Patrones de dise;os: POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron observador"));
        libro.addPagina(new Pagina("Patron singleton"));
        libro.addPagina(new Pagina("Patron factory"));
        libro.addPagina(new Pagina("Patron facade"));
        libro.addPagina(new Pagina("Patron composite"));

        Informe informe = new Informe(new Persona("Martin","Flowler"),
                new Persona("James","goslin"),"Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Tola, imprimiendo objeto generico de una clase anonima";
            }
        });
        System.out.println(TEXTO_DEFECTO);
    }
}