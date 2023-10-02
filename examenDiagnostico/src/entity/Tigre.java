package entity;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }


    @Override
    public String comer() {
        return "Tigre comiendo carne";
    }

    @Override
    public String dormir() {
        return "Tigre durmiendo";
    }

    @Override
    public String correr() {
        return "Tigre corriendo";
    }

    @Override
    public String comunicarse() {
        return "Tigre comunicando";
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
