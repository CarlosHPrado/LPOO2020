package Construtor;

public class Cliente {

    int codigo_cliente;
    String nome;

    Cliente(int codigo_cliente, String nome){
        this.codigo_cliente = codigo_cliente;
        this.nome=nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public String getNome() {
        return nome;
    }
}
