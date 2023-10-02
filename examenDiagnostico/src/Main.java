import entity.*;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];
        mamiferos[0] = new Tigre("Salvaje",1.20f,2.00f,230.0f,"tigrus",6.50f,120,"Tigre Blanco");
        mamiferos[1] = new Leon("Habitat Salvaje",2.25f,3.00f,300.0f,"leonis",4.5f,70,2,150.3f);
        mamiferos[2] = new Guepardo("Salvaje",0.85f,1.35f,100.02f,"guepardis",2.5f,150);
        mamiferos[3] = new Lobo("Montanias",0.50f,0.70f,45.0f,"lobus","Gris",4.5f,7,"Lobo de montania");
        mamiferos[4] = new Perro("Domestico",0.60f,1.0f,20.0f,"dogus","canela",1.0f,25);

        for (Mamifero mamifero : mamiferos) {
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println(mamifero.toString());
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }
}