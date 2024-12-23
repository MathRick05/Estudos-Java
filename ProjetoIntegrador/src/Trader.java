import java.util.List;

public class Trader {
    private String nome;
    private int idTrader;
    private String regiaoAtuacao;
    private List<Promotor> promotores;

    public Trader(String nome, int idTrader, String regiaoAtuacao, List<Promotor> promotores) {
        this.nome = nome;
        this.idTrader = idTrader;
        this.regiaoAtuacao = regiaoAtuacao;
        this.promotores = promotores;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "nome='" + nome + '\'' +
                ", idTrader=" + idTrader +
                ", regiaoAtuacao='" + regiaoAtuacao + '\'' +
                ", promotores=" + promotores +
                '}';
    }
}
