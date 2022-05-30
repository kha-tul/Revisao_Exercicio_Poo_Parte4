package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidade;

        System.out.println("Digite quantos numeros(no maximo 15 numeros) deseja adicionar ao array: ");
        quantidade = entrada.nextInt();

        if (quantidade > 15) {
            System.out.println("permitido no maximo 15 numeros! ");
            entrada.close();
        } else {

            int numeros[] = new int[quantidade];
            int contador = 0;
            boolean repetidos = true;

            while (contador < quantidade) {
                System.out.println("Digite o " + (contador + 1) + "º numero:");
                numeros[contador] = entrada.nextInt();
                contador++;
            }

            for (int i = 0; i < quantidade - 1; i++) {
                for (int j = i + 1; j < quantidade; j++) {
                    if (numeros[j] == numeros[i]) {
                        repetidos = false;
                    }
                }
            }

            if (repetidos) {
                Arrays.sort(numeros);
                System.out.println("retornando um array com esses numeros em ordem crescente");
                System.out.println(Arrays.toString(numeros));
            } else {
                System.out.println("Não pode adicionar numeros repetidos!");
                entrada.close();
            }

        }
    }
}
