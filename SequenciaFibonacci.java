package exercicios.lacos.basico;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo; // Atualiza os valores para os próximos termos
        }
        
        scanner.close();
    }
}

/* Explicação: O programa utiliza um laço for
 *  que inicia em 10 e decremente até 1, imprimindo cada número.
 */