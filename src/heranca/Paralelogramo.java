package heranca;

public class Paralelogramo extends Forma {
    private double base;
    private double altura;

    public Paralelogramo(double base, double altura, double[] coordenadasCentro) {
        super("Paralelogramo", coordenadasCentro);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }
}
