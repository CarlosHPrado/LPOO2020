package Construtor;

public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1,"Carlos","celular");
        Pedido pedido2 = new Pedido(1,"Flinston","perfume");

        System.out.println("Nome do cliente: " + pedido1.getNome_cliente() + " descrição do pedido: " +pedido1.getDescricao_pedido());

        System.out.println("Nome do cliente: " + pedido2.getNome_cliente() + " descrição do pedido: " +pedido2.getDescricao_pedido());

        pedido1.mudarDesc("celular xiomi");
        pedido1.mudarNome("Carlinhos");

        pedido2.mudarDesc("Carro");
        pedido2.mudarNome("Carlos");


        System.out.println("Nome do cliente: " + pedido1.getNome_cliente() + " descrição do pedido: " +pedido1.getDescricao_pedido());

        System.out.println("Nome do cliente: " + pedido2.getNome_cliente() + " descrição do pedido: " +pedido2.getDescricao_pedido());
    }
}
