//Exercício 10: Número Primo
//Escreva um programa que determine se um número fornecido pelo usuário é primo.
//Um número primo é aquele que só é divisível por 1 e por ele mesmo.


import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean eounaoe = true;

        System.out.println("Digite um numero:");
        int num1 = scanner.nextInt();


        if(num1 <= 1){
            System.out.println("Numero menor que 1");
        }

        for(int i = 2; i <= num1 / 2; i++){
            if(num1 % i == 0){
                eounaoe = false;
                break;
            }else{
                eounaoe = true;
            }
        }

        if(eounaoe){
            System.out.printf("Numero %d é primo", num1);
        }else{
            System.out.printf("Numero não %d é primo", num1);
        }

    }
}
