package entity;

public abstract class Canino extends Mamifero {
    protected String color;
    protected Float tamanoColmillos ;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico,String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
}

