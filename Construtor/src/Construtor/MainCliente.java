package Construtor;

public class MainCliente {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente(1,"carlos");
    Cliente cliente2 = new Cliente(2,"carlinhos");

    System.out.println("Nome do cliente: "+cliente1.getNome() +" id do cliente: " + cliente1.getCodigo_cliente());
    System.out.println("Nome do cliente: " + cliente2.getNome()+" id do cliente: " + cliente2.getCodigo_cliente());

    cliente1.setNome("Carlos");
    cliente2.setNome("Carlinhos");

    System.out.println("Nome do cliente: " + cliente1.getNome()+" id do cliente: " + cliente1.getCodigo_cliente());
    System.out.println("Nome do cliente: " + cliente2.getNome()+" id do cliente: " + cliente2.getCodigo_cliente());


    }
}
