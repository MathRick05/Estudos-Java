import java.util.Scanner;

public class ContaPoupanca extends  implements ContaBancaria{

    @Override
    public double depositar(double saldo) {
        System.out.println("Digite o valor que deseja depositar:");
        saldo = scanner.nextDouble();
        return saldo;
    }

    @Override
    public double sacar(double valor) {
        saldoAtual = valor - saldoAtual;

        return
    }

    @Override
    public String getSaldo(double saldo ,double valor) {
        return "Extrato:" +
                ", Saldo Atual :" + saldo +
                ';';
    }
}
