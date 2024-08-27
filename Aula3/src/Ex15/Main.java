package Ex15;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Supermercado ABC", "Rua das Flores, 123", "1234-5678");
        loja.abrir();
        loja.fechar();

        System.out.println();
    }
}

