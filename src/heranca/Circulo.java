package heranca;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, double[] coordenadasCentro) {
        super("Circulo", coordenadasCentro);
        this.raio = raio;
    }

    public double area() {
        return super.PI * this.raio * this.raio;
    }

}