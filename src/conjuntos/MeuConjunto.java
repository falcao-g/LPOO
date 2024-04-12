package conjuntos;

import java.util.TreeSet;
import java.util.Set;

public class MeuConjunto<E> extends TreeSet<E> implements Conjunto<E> {
    /**
     * Retorna um novo conjunto contendo os elementos pertencentes
     * a união deste conjunto (this) com outro conjunto passado como parâmetro.
     * 
     * @param outro Segundo conjunto usado.
     * @return Um novo Set<E> contendo união
     *         deste conjunto com outro conjunto passado como parâmetro.
     */
    public Conjunto<E> uniao(Set<E> outro) {
        Conjunto<E> uniao = new MeuConjunto<>();
        uniao.addAll(this);
        for (E elemento : outro) {
            uniao.add(elemento);
        }
        return uniao;
    }

    /**
     * Retorna um novo conjunto contendo os elementos pertencentes
     * a interseção deste conjunto (this) com outro conjunto passado como parâmetro.
     * 
     * @param outro Segundo conjunto usado.
     * @return Um novo Conjunto<E> contendo interseção
     *         deste conjunto com outro conjunto passado como parâmetro.
     */
    public Conjunto<E> intersecao(Set<E> outro) {
        Conjunto<E> intersecao = new MeuConjunto<>();

        for (E elemento : outro) {
            if (this.contains(elemento)) {
                intersecao.add(elemento);
            }
        }
        return intersecao;
    }

    /**
     * Retorna um novo conjunto contendo os elementos pertencentes
     * a diferença deste conjunto (this) com outro conjunto passado como parâmetro.
     * 
     * @param outro Segundo conjunto usado.
     * @return Um novo Conjunto<E> contendo a diferença
     *         deste conjunto com outro conjunto passado como parâmetro.
     */
    public Conjunto<E> diferenca(Set<E> outro) {
        Conjunto<E> diferenca = new MeuConjunto<>();
        diferenca.addAll(this);

        for (E elemento : outro) {
            if (diferenca.contains(elemento)) {
                diferenca.remove(elemento);
            }
        }

        return diferenca;
    }

    /**
     * Imprime na saída padrão todos os elementos do conjunto, um por linha.
     */
    public void imprimeConjunto() {
        for (E elemento : this) {
            System.out.println(elemento);
        }
        System.out.println();
    }
}
