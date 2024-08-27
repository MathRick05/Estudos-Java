package Ex9;

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque. Estoque atual: " + this.quantidadeEstoque);
        } else {
            System.out.println("Quantidade inválida ou insuficiente em estoque para remover.");
        }
    }

    public void aumentarEstoque(int quantidade){
            if (quantidade > 0) {
                this.quantidadeEstoque += quantidade;
                System.out.println(quantidade + " unidades adicionadas ao estoque. Estoque atual: " + this.quantidadeEstoque);
            } else {
                System.out.println("Quantidade inválida para aumentar o estoque.");
            }
    }
}
