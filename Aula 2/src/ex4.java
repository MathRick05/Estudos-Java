//Exercício 4: Estruturas Condicionais
//Crie um programa que leia um número inteiro do usuário e verifique se ele é par ou ímpar.
//Exiba uma mensagem correspondente no console.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if(num % 2 == 0)
        {
            System.out.printf("O numero %d é par", num);
        }else{
            System.out.printf("O numero %d é impar", num);
        }

    }
}
