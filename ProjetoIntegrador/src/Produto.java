public class Produto {
    private String nome;
    private int idProduto;
    private String categoria;

    public Produto(String nome, int idProduto, String categoria) {
        this.nome = nome;
        this.idProduto = idProduto;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", idProduto=" + idProduto +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}