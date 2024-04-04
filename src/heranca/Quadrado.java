package heranca;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado, double[] coordenadasCentro) {
        super("Quadrado", coordenadasCentro);
        this.lado = lado;
    }

    public double area() {
        return this.lado * this.lado;
    }
}