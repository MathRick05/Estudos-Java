//Exercício 3: Operadores Aritméticos
//Escreva um programa que leia dois números do usuário e exiba a soma, subtração,
// multiplicação e divisão desses números.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.printf("Soma:%d\nSubtração:%d\nMultiplicação:%d\nDivisão:%d", soma, sub, mult, div);
    }
}
