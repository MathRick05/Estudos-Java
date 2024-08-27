package Ex4;

import java.util.Scanner;

public class ContaBancaria {

    public int NumConta;
    public double Saldo;

    public ContaBancaria(int NumConta, double Saldo) {
        this.NumConta = NumConta;
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "NumConta=" + NumConta +
                ", Saldo=" + Saldo +
                '}';
    }

    public void Sacar(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor que deseja sacar?");
        double sacado = scanner.nextDouble();

        System.out.printf("%f extraido.", sacado);

        double saldoAtual = Saldo - sacado;

        System.out.println(saldoAtual);

    }

    public void Depositar(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor que deseja depositar?");
        double deposito = scanner.nextDouble();

        System.out.printf("%f Depositado.", deposito);

        double saldoAtual = Saldo + deposito;

        System.out.println(saldoAtual);

    }
}
