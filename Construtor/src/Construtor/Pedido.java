package Construtor;

import javax.swing.*;

public class Pedido {
    int codigo_pedido ;
    String nome_cliente, descricao_pedido;

    public Pedido(int codigo_pedido, String nome_cliente,String descricao_pedido) {
        this.codigo_pedido=codigo_pedido ;
        this.nome_cliente = nome_cliente;
        this.descricao_pedido=descricao_pedido;
    }

    public void mudarNome(String nome){
        this.nome_cliente = nome;
    }

    public void mudarDesc(String desc){
        this.descricao_pedido = desc;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public String getDescricao_pedido() {
        return descricao_pedido;
    }
}
