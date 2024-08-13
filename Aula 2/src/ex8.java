//Exercício 8: Entrada de Dados
//Escreva um programa que leia o nome e a idade de uma pessoa a partir do teclado
//e imprima uma mensagem no console com essas informações.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.printf("Nome:%s\nIdade:%d", nome, idade);
    }
}
