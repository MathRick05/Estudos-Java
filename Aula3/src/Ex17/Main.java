package Ex17;

public class Main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Senhor dos Anéis", "J.R.R. Tolkien", 5.3);
        livro.abrir();
        livro.fechar();

        System.out.println();
    }
}

