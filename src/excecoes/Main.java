package excecoes;

public class Main {
    public static void main(String[] args) {
        Lancador lancador = new Lancador();
        Capturador capturador = new Capturador();
        Testador t = new Testador();

        capturador.capturaExcecao(t);
        t.capturaExcecao(lancador);
    }
}
