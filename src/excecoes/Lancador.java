package excecoes;

public class Lancador implements LancadorDeExcecao {
    public void lancaExcecao() throws Exception {
        throw new Exception("Erro!");
    }
}
