package Ex20;

public class Empresa {
    public String nome;
    public String cnpj;
    public int numeroFuncionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Um novo funcionário foi contratado. Número de funcionários: " + numeroFuncionarios);
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Número de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}

