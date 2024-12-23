import java.util.Scanner;

public class ContaCorrente implements ContaBancaria{
    public double saldoAtual;

    @Override
    public double depositar() {
        System.out.println("Deposito concluido");

        return saldoAtual;

    }

    @Override
    public double sacar(double valor) {
        saldoAtual = valor - saldoAtual;
        System.out.printf("R$%d retirado!", valor);

    }

    @Override
    public String getSaldo(double saldo, double valor) {
        return "Extrato:" +
                ", Saldo Atual :" + saldo +
                ", Ultimo valor retirado :" + valor +
                ';';
    }
}
