package excecoes;

public class Capturador implements CapturadorDeExcecao {
    public void capturaExcecao(LancadorDeExcecao o) {
        try {
            o.lancaExcecao();
        } catch (Exception e) {
            System.out.printf("Exceção capturada! Mensagem: %s\n", e.getMessage());
        }
    }
}
