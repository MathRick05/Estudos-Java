import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GrandeMercado mercado1 = new GrandeMercado("Mercado Central", 1, "Rua A, 123");
        Produto produto1 = new Produto("Arroz", 101, "Alimento");
        List<GrandeMercado> mercados = new ArrayList<>();
        mercados.add(mercado1);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);

        Promotor promotor = new Promotor("João", 201, mercados, produtos, new ArrayList<>());
        Roteiro roteiro = new Roteiro(301, "Roteiro Semanal", new Date(), mercados);
        List<Promotor> promotores = new ArrayList<>();
        promotores.add(promotor);
        Trader trader = new Trader("Carlos", 101, "Norte", promotores);
        Software software = new Software("Gestão de Promotores", "1.0", 1);

        // Relatório
        System.out.println("Software: " + software);
        System.out.println("Trader: " + trader);
        System.out.println("Promotor: " + promotor);
        System.out.println("Mercado: " + mercado1);
        System.out.println("Produto: " + produto1);
    }
}