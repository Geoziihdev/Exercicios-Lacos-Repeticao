package exercicios.lacos.basico;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Imprime espaços para centralizar
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Imprime asteriscos
            }
            System.out.println(); // Nova linha após cada linha da pirâmide
        }
        
        scanner.close();
    }
}


/* Explicação: O programa utiliza dois laços aninhados:
 *  um para os espaços e outro para os asteriscos, formando a pirâmide.
 */