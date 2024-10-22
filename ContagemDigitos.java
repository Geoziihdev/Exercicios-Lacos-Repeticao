package exercicios.lacos.basico;

import java.util.Scanner;

public class ContagemDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        int contagem = 0;

        while (n != 0) {
            n /= 10; // Remove o último dígito
            contagem++; // Conta um dígito
        }

        System.out.println("O número tem " + contagem + " dígitos.");
        scanner.close();
    }
}

/* Explicação: O programa usa um laço while para contar quantos dígitos um número tem,
 *  dividindo o número por 10 até que ele se torne 0.
 */