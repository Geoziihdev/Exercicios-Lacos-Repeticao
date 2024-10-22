package exercicios.lacos.basico;

public class SomaPares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 2; i <= 100; i += 2) {
            soma += i; // Soma os números pares de 2 a 100
        }

        System.out.println("A soma dos números pares entre 1 e 100 é: " + soma);
    }
}

/*Explicação: O programa utiliza um laço for
 *  que inicia em 2 e incrementa de 2 em 2 até 100, somando os valores.
 */