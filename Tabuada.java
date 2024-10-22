package exercicios.lacos.basico;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        
        scanner.close();
    }
}

/* Explicação: O programa solicita um número e usa um laço for 
 * para multiplicá-lo de 1 a 10, 
 */