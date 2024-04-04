package heranca;

/**
 * Classe "container" que terá como responsabilidade
 * armazenar várias formas geométricas.
 */
public final class Desenho {
    private Forma[] listaDeFormas;

    /**
     * Construtor recebe um array de formas geométricas que
     * farão parte do desenho final.
     * 
     * @param listaDeFormas Um array de formas geométricas.
     */
    public Desenho(Forma[] listaDeFormas) {
        this.listaDeFormas = listaDeFormas;
    }

    /**
     * Imprime informações das formas geométricas armazenadas.
     * 
     * Em cada linha é impresso as seguintes informações:
     * [Contagem] - [Nome da forma geométrica] com centro [coordenadas] e área
     * [valor].
     * 
     * Por exemplo, caso o desenho tenha duas formas geométricas (circulo e elipse),
     * elas serão impressas da seguinte forma:
     * 
     * 1 - Circulo com centro (1.000000,1.000000) e área = 3.141590.
     * 2 - Elipse com centro (3.000000,3.000000) e área = 12.566360.
     */
    public void imprimeInformacoesDesenho() {
        for (int i = 0; i < this.listaDeFormas.length; i++) {
            Forma f = this.listaDeFormas[i];
            double[] coord = f.getCoordenadasCentro();
            System.out.printf("%d - %s com centro (%f,%f) e área = %f.\n",
                    i + 1, f.getNome(), coord[0], coord[1], f.area());
        }
    }
}
