/*
 * Escreva no método main() um programa em Java que receba da entrada padrão três pares de números reais. 
 * Para cada par de números, o primeiro valor é a informação do peso em Kg de uma pessoa adulta e o segundo valor é a informação da altura dessa mesma pessoa em metros.
 * O programa deve ser capaz de calcular o valor de IMC (índice de massa corpórea) para cada pessoa, isto é, para cada par de valores peso e altura informados. 
 * Além disso, o programa deve imprimir, em ordem crescente, os valores de IMC separados por vírgulas.
 * 
 * O cálculo de IMC é dado pela seguinte fórmula: 
 * 
 * IMC = peso / altura²
 * 
 * Um exemplo de entrada e saída é mostrado a seguir:
 * 
 * Entrada: 70 1.7 75 1.65 50 1.8
 * Saída: 15.432100, 24.221453, 27.548210
 */

import java.util.Scanner;

public class SortIMC {
    public static int pai(int n) {
        return (n - 1) / 2;
    }

    public static int filho_esq(int n) {
        return (n * 2 + 1);
    }

    public static int filho_dir(int n) {
        return (n * 2 + 2);
    }

    public static void desce(float v[], int tam, int n) {
        int maior = n;
        int esq = filho_esq(n);
        int dir = filho_dir(n);

        if (esq < tam && v[esq] > v[maior])
            maior = esq;
        if (dir < tam && v[dir] > v[maior])
            maior = dir;

        if (maior != n) {
            float aux = v[maior];
            v[maior] = v[n];
            v[n] = aux;

            desce(v, tam, maior);
        }
    }

    public static void constroi_heap(float v[], int tam) {
        for (int n = pai(tam); n >= 0; n--)
            desce(v, tam, n);
    }

    public static void heapsort(float v[], int tam) {
        constroi_heap(v, tam);
        for (int n = tam - 1; n >= 1; n--) {
            float aux = v[0];
            v[0] = v[n];
            v[n] = aux;
            desce(v, n, 0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] valores = new float[6];

        for (int i = 0; i < 6; i++) {
            valores[i] = input.nextFloat();
        }

        float[] indices = new float[3];
        indices[0] = valores[0] / (valores[1] * valores[1]);
        indices[1] = valores[2] / (valores[3] * valores[3]);
        indices[2] = valores[4] / (valores[5] * valores[5]);

        heapsort(indices, 3);

        System.out.printf("%.6f, %.6f, %.6f", indices[0], indices[1], indices[2]);
        input.close();
    }
}
