package Ex19;

public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Gourmet", 4, "Branca");
        cozinha.cozinhar();
        cozinha.limpar();

        System.out.println();
    }
}

