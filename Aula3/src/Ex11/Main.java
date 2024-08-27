package Ex11;

public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12300000, "SP");
        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(3000);
        cidade.diminuirPopulacao(13000000);
    }
}
