package Construtor;

public class Pneu {
    double preco;
    String tipo, fabricante;

    public Pneu(double preco, String tipo, String fabricante) {
        this.preco = preco;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
