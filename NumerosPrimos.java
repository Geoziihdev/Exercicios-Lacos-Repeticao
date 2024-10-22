package exercicios.lacos.basico;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        System.out.println("Números primos de 1 a " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false; // Não é primo
                    break;
                }
            }

            if (primo) {
                System.out.print(i + " "); // Imprime o número primo
            }
        }
        
        scanner.close();
    }
}

/* Explicação: O programa verifica se um número é primo
 *  ao dividir por todos os números menores ou iguais à raiz quadrada dele,
 *   imprimindo apenas os números primos.
 *   */
