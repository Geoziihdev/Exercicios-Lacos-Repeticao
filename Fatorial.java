package exercicios.lacos.basico;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i; // Multiplica o fatorial pelo índice
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
        scanner.close();
    }
}


/* Explicação: O programa calcula o fatorial de um número utilizando um laço for
 *  que multiplica o valor acumulado pelo índice a cada iteração.
 */