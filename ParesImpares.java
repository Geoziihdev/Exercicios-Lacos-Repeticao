package exercicios.lacos.basico;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        System.out.println("Números pares:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); // Imprime números pares
            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " "); // Imprime números ímpares
            }
        }
        
        scanner.close();
    }
}

/* Explicação: O programa usa dois laços for:
 *  um para imprimir números pares e outro para números ímpares, 
 *  utilizando a condição de módulo (%).
 */