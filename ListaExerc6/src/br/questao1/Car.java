package br.questao1;

public class Car implements CarbonFootprint{
    private String combustivel;
    private String modelo;

    @Override
    public int getCarbonFootprint() {
        return 2;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
