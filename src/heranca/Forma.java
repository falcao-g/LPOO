package heranca;

/**
 * Classe abstrata que implementa a superclasse "Forma".
 * 
 * Esta superclasse deve ser herdada por todas as classes que representam formas
 * geométricas que possam ter sua área calculada.
 */
public abstract class Forma {

    /* Constante com o valor de PI, pode ser usada nos cálculos de área */
    protected final double PI = 3.14159;
    private String nome;
    private double[] coordenadasCentro;

    /**
     * O construtor desta superclasse recebe o nome da forma
     * geométrica e um array contendo um par de coordenadas 2D
     * do centro desta forma geométrica no plano cartesiano.
     * 
     * @param nome              Nome da forma geométrica.
     * @param coordenadasCentro Par de coordenadas do centro da forma
     *                          geométrica.
     */
    public Forma(String nome, double[] coordenadasCentro) {
        this.nome = nome;
        this.coordenadasCentro = coordenadasCentro;
    }

    /**
     * Retorna nome da forma geométrica.
     * 
     * @return Nome da forma geométrica.
     */
    public final String getNome() {
        return this.nome;
    }

    /**
     * Método abstrato que calcula a área da forma geométrica.
     * Deve ser implementado por todas as subclasses.
     * 
     * @return Valor da área da forma geométrica em unidade arbitrária.
     */
    public abstract double area();

    /**
     * Retorna o par de coordenadas do centro da forma geométrica.
     * 
     * @return Array contendo par de coordenadas.
     */
    public final double[] getCoordenadasCentro() {
        return this.coordenadasCentro;
    }

    /**
     * Define o par de coordenadas do centro da forma geométrica.
     * 
     * @param coord Array contendo par de coordenadas.
     */
    public final void setCoordenadasCentro(double[] coord) {
        this.coordenadasCentro = coord;
    }

}
