package Ex11;

public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            this.populacao += quantidade;
            System.out.println("A população da cidade " + nome + " aumentou em " + quantidade + ". População atual: " + this.populacao);
        } else {
            System.out.println("Quantidade inválida para aumentar a população.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= this.populacao) {
            this.populacao -= quantidade;
            System.out.println("A população da cidade " + nome + " diminuiu em " + quantidade + ". População atual: " + this.populacao);
        } else {
            System.out.println("Quantidade inválida ou insuficiente para diminuir a população.");
        }
    }
}
