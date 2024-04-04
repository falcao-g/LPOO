package heranca;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura, double[] coordenadasCentro) {
        super("Retangulo", coordenadasCentro);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }
}