import java.util.Date;
import java.util.List;

public class Roteiro {
    private int idRoteiro;
    private String descricao;
    private Date dataExecucao;
    private List<GrandeMercado> mercados;

    public Roteiro(int idRoteiro, String descricao, Date dataExecucao, List<GrandeMercado> mercados) {
        this.idRoteiro = idRoteiro;
        this.descricao = descricao;
        this.dataExecucao = dataExecucao;
        this.mercados = mercados;
    }

    @Override
    public String toString() {
        return "Roteiro{" +
                "idRoteiro=" + idRoteiro +
                ", descricao='" + descricao + '\'' +
                ", dataExecucao=" + dataExecucao +
                ", mercados=" + mercados +
                '}';
    }
}