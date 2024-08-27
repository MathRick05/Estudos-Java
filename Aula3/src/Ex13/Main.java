package Ex13;

public class Main {
    public static void main(String[] args) {
        Time time = new Time("São Paulo FC", "Rogério Ceni", 11);
        time.adicionarJogador("Luciano");
        time.adicionarJogador("Calleri");
        time.removerJogador("Luciano");

        System.out.println();
    }
}

