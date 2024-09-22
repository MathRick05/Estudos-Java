public class Main {
    public static void main(String[] args) {

        Produto cafe = new Produto("Café", 5.5);
        Produto pao = new Produto("Pão", 3.0);
        Produto leite = new Produto("Leite", 6.0);

        ItemPedido item1 = new ItemPedido(cafe, 2);
        ItemPedido item2 = new ItemPedido(pao, 5);
        ItemPedido item3 = new ItemPedido(leite, 3);

        Endereco endereco = new Endereco("Rua A", "123", "São Paulo", "12345-678");
        Cliente cliente = new Cliente("João", endereco);

        Pedido pedido = new Pedido(1, cliente, endereco);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        pedido.imprimirComanda();
    }
}
