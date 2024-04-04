package heranca;

public class Trapezio extends Forma {
    private double baseMenor;
    private double baseMaior;
    private double altura;

    public Trapezio(double baseMenor, double baseMaior, double altura, double[] coordenadasCentro) {
        super("Trapezio", coordenadasCentro);
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
    }

    public double area() {
        return (this.baseMenor + this.baseMaior) * this.altura / 2.0;
    }
}