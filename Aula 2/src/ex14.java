//Exercício 14: Contagem de Vogais
//Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Digite uma palavra:");
        String palavra = scanner.next();
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < palavra.length(); i++){
            char caractere = palavra.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
                contador++;
            }
        }

        System.out.println("Número de vogais na string: " + contador);

    }
}
