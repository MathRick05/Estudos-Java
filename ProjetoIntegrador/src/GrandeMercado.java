public class GrandeMercado {
    private String nome;
    private int idMercado;
    private String endereco;

    public GrandeMercado(String nome, int idMercado, String endereco) {
        this.nome = nome;
        this.idMercado = idMercado;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "GrandeMercado{" +
                "nome='" + nome + '\'' +
                ", idMercado=" + idMercado +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}