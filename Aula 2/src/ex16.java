//Exercício 16: Conversor de Temperatura
//Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit.
//O usuário deve escolher qual conversão deseja realizar e inserir o valor da temperatura a ser convertida.

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        double temperaturaConvertida = 0;
        double temperatura;

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            temperatura = scanner.nextDouble();
            temperaturaConvertida = celsiusParaFahrenheit(temperatura);
            System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit\n", temperatura, temperaturaConvertida);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            temperatura = scanner.nextDouble();
            temperaturaConvertida = fahrenheitParaCelsius(temperatura);
            System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius\n", temperatura, temperaturaConvertida);
        } else {
            System.out.println("Opção inválida. Escolha 1 ou 2.");
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

