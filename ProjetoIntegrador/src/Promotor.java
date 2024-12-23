import java.util.List;

public class Promotor {
    private String nome;
    private int idPromotor;
    private List<GrandeMercado> mercados;
    private List<Produto> produtos;
    private List<Roteiro> roteiros;

    public Promotor(String nome, int idPromotor, List<GrandeMercado> mercados, List<Produto> produtos, List<Roteiro> roteiros) {
        this.nome = nome;
        this.idPromotor = idPromotor;
        this.mercados = mercados;
        this.produtos = produtos;
        this.roteiros = roteiros;
    }

    public void enviarFoto(String foto, GrandeMercado mercado) {
        // Implementar envio de foto
    }

    public void sinalizarAbastecimento(GrandeMercado mercado) {
        // Implementar sinalização de abastecimento
    }

    @Override
    public String toString() {
        return "Promotor{" +
                "nome='" + nome + '\'' +
                ", idPromotor=" + idPromotor +
                ", mercados=" + mercados +
                ", produtos=" + produtos +
                ", roteiros=" + roteiros +
                '}';
    }
}
