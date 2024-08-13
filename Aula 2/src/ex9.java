//Exercício 9: Calculadora Simples
//Crie um programa que funcione como uma calculadora simples.
//Ele deve oferecer ao usuário opções para somar, subtrair, multiplicar ou dividir dois números.
//Use uma estrutura switch para selecionar a operação.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Soma\n2-Subtração\n3-Divisão\n4-Multiplicação");
        int opc = scanner.nextInt();

        switch (opc){
            case 1:
                System.out.println("Digite o primeiro numero:");
                int soma1 = scanner.nextInt();
                System.out.println("Digite o segundo numero:");
                int soma2 = scanner.nextInt();

                int soma = soma1 + soma2;
                System.out.println(soma);
                break;

            case 2:
                System.out.println("Digite o primeiro numero:");
                int sub1 = scanner.nextInt();
                System.out.println("Digite o segundo numero:");
                int sub2 = scanner.nextInt();

                int sub = sub1 - sub2;
                System.out.println(sub);
                break;

            case 3:
                System.out.println("Digite o primeiro numero:");
                int div1 = scanner.nextInt();
                System.out.println("Digite o segundo numero:");
                int div2 = scanner.nextInt();

                int div = div1 / div2;
                System.out.println(div);
                break;

            case 4:
                System.out.println("Digite o primeiro numero:");
                int mult1 = scanner.nextInt();
                System.out.println("Digite o segundo numero:");
                int mult2 = scanner.nextInt();

                int mult = mult1 * mult2;
                System.out.println(mult);
                break;

            default:
                System.out.println("Valor invalido");
        }
    }
}
