package Ex4;

import Ex3.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1, 1000);

        System.out.println("O que deseja fazer?\n1-Depositar 2-Sacar");
        int opc = scanner.nextInt();
        if(opc == 1){
            System.out.println(conta);
            conta.Depositar();
        }else {
            System.out.println(conta);
            conta.Sacar();
        }
    }
}
