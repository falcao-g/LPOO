package conjuntos;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Conjunto<Integer> conjunto1 = new MeuConjunto<>();
    Conjunto<Integer> conjunto2 = new MeuConjunto<>();
    Scanner s = new Scanner(System.in);

    /*
     * Preencher os conjuntos com inteiros lidos da entrada padrão.
     * 
     * A entrada padrão receberá duas sequencias de inteiros organizados
     * da seguinte forma:
     * 
     * <n> <lista de N valores do primeiro conjunto>
     * <m> <lista de M inteiros do segundo conjunto>
     * 
     * Por exemplo:
     * 5 10 20 30 40 50
     * 3 5 30 10
     * 
     * A primeira sequencia de 5 números deverá ser inserida no
     * conjunto1 e a segunda sequencia de 3 números deverá ser
     * inserida no conjunto2.
     * 
     * Por fim, basta realizar as operações de união, interseção e
     * diferença e imprimir o conjunto resultante.
     */
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      conjunto1.add(s.nextInt());
    }

    int m = s.nextInt();
    for (int i = 0; i < m; i++) {
      conjunto2.add(s.nextInt());
    }

    conjunto1.uniao(conjunto2).imprimeConjunto();
    conjunto1.intersecao(conjunto2).imprimeConjunto();
    conjunto1.diferenca(conjunto2).imprimeConjunto();
    s.close();
  }
}