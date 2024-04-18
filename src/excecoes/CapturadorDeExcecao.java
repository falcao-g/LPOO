package excecoes;

/**
 * Interface que define um método que deve capturar
 * uma exceção lançada por outro objeto.
 */
public interface CapturadorDeExcecao {
    /**
     * Este método captura uma exceção lançada pelo
     * objeto passado como parâmetro.
     * 
     * Ao capturar essa exceção, a classe imprime na
     * saída padrão a seguinte mensagem:
     * 
     * "Exceção capturada! Mensagem: %s"
     * 
     * Onde %s é impressa a mensagem de erro armazenada
     * na exceção capturada.
     * 
     * @param o Objeto lançador de exceções.
     */
    void capturaExcecao(LancadorDeExcecao o);
}
