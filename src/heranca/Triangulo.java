package heranca;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, double[] coordenadasCentro) {
        super("Triangulo", coordenadasCentro);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura / 2.0;
    }
}