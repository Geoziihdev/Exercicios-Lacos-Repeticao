package exercicios.lacos.basico;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i; // Soma todos os números de 1 até n
        }

        System.out.println("A soma de 1 até " + n + " é: " + soma);
        scanner.close();
    }
}


/*Explicação: O programa pede um número do usuário e usa um laço for para somar todos os números
 *  de 1 até esse número, armazenando o resultado na variável soma.
 *  
*/
