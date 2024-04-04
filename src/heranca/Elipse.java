package heranca;

public class Elipse extends Forma {
    private double raioMaior;
    private double raioMenor;

    public Elipse(double raioMaior, double raioMenor, double[] coordenadasCentro) {
        super("Elipse", coordenadasCentro);
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }

    public double area() {
        return this.raioMaior * this.raioMenor * super.PI;
    }
}