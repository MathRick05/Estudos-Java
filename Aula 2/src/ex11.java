//Exercício 11: Palíndromo
//Crie um programa que verifique se uma palavra fornecida pelo usuário é um palíndromo
//(palavra que se lê da mesma forma de trás para frente).

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();
        nome = nome.replaceAll("\\s+", "").toLowerCase();

        if(ehpalindromo(nome))
        {
            System.out.printf("O nome:%s é palíndromo!", nome);
        }else{
            System.out.printf("O nome:%s não é palíndromo!", nome);
        }

    }

    public static boolean ehpalindromo(String nome){
        int size = nome.length();

        for (int i = 0; i < size / 2; i++){
            if(nome.charAt(i) != nome.charAt(size - 1 - i)){
                return false;
            }
        }
        return true;
    }

}
