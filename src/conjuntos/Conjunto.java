package conjuntos;

import java.util.Set;

/**
 * Interface Conjunto adiciona operações de união, interseção e
 * diferença a um Set<E>.
 */
public interface Conjunto<E> extends Set<E> {
    /**
     * Retorna um novo conjunto contendo os elementos pertencentes
     * a união deste conjunto (this) com outro conjunto passado como parâmetro.
     * 
     * @param outro Segundo conjunto usado.
     * @return Um novo Set<E> contendo união
     *         deste conjunto com outro conjunto passado como parâmetro.
     */
    Conjunto<E> uniao(Set<E> outro);

    /**
     * Retorna um novo conjunto contendo os elementos pertencentes
     * a interseção deste conjunto (this) com outro conjunto passado como parâmetro.
     * 
     * @param outro Segundo conjunto usado.
     * @return Um novo Conjunto<E> contendo interseção
     *         deste conjunto com outro conjunto passado como parâmetro.
     */
    Conjunto<E> intersecao(Set<E> outro);

    /**
     * Retorna um novo conjunto contendo os elementos pertencentes
     * a diferença deste conjunto (this) com outro conjunto passado como parâmetro.
     * 
     * @param outro Segundo conjunto usado.
     * @return Um novo Conjunto<E> contendo a diferença
     *         deste conjunto com outro conjunto passado como parâmetro.
     */
    Conjunto<E> diferenca(Set<E> outro);

    /**
     * Imprime na saída padrão todos os elementos do conjunto, um por linha.
     */
    void imprimeConjunto();
}