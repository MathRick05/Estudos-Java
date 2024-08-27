package Ex9;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Laptop", 2500.00, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
        produto.diminuirEstoque(15);
    }
}
