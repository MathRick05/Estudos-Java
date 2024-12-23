public interface ContaBancaria {

    double depositar(double saldo);
    double sacar(double valor);
    String getSaldo(double saldo ,double valor);
}
