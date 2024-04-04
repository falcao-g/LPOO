package heranca;

public class Main {
    public static void main(String[] args) {
        Parser p = new Parser(args);
        Desenho d = p.getDesenho();

        d.imprimeInformacoesDesenho();
    }
}