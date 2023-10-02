package entity;

public class Lobo extends Canino{
    private Integer numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos,
                Integer numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "Lobo esta comiendo";
    }

    @Override
    public String dormir() {
        return "Lobo esta durmiendo";
    }

    @Override
    public String correr() {
        return "Lobo esta corriendo";
    }

    @Override
    public String comunicarse() {
        return "Lobo esta comunicandose";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numeroCamada=" + numeroCamada +
                ", especieLobo='" + especieLobo + '\'' +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
