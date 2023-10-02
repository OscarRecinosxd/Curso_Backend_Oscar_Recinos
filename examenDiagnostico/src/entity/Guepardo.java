package entity;

public class Guepardo extends Felino{


    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Guepardo esta comiendo";
    }

    @Override
    public String dormir() {
        return "Guepardo esta durmiendo";
    }

    @Override
    public String correr() {
        return "Guepardo esta corriendo";
    }

    @Override
    public String comunicarse() {
        return "Guepardo se esta comunicando";
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
