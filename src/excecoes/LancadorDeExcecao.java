package excecoes;

/**
 * Interface que define um método que lança
 * uma exceção qualquer.
 */
public interface LancadorDeExcecao {
    /**
     * Este método lança uma exceção qualquer.
     * 
     * A exceção lançada contém uma mensagem de
     * status informado o tipo do erro.
     * 
     * @throws Exception
     */
    void lancaExcecao() throws Exception;
}