//Exercício 13: Jogo de Adivinhação
//Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório entre 1 e 100,
//e o usuário deve adivinhar qual é o número.
//O programa deve fornecer dicas ao usuário se o palpite for muito alto ou muito baixo e
//contar o número de tentativas até o acerto.

import java.util.Random;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num_certo = random.nextInt(100);

        System.out.println("Digite um numero:");
        int guess = scanner.nextInt();

        while (guess != num_certo) {
            if (guess > num_certo) {
                System.out.printf("%d Quente demais!! Tente novamente!!\n", guess);
            } else if (guess < num_certo) {
                System.out.printf("%d Ta frio!! Tente novamente!!\n", guess);
            }

            System.out.println("Digite um numero:");
            guess = scanner.nextInt();

        }
        System.out.printf("Você acertou o numero:%d!! Parabens!!", num_certo);
    }
}
