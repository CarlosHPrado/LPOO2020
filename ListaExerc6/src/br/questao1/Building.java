package br.questao1;

public abstract class Building implements CarbonFootprint {
    private int pessoas;
    private boolean usoDeEnergiaRenovavel;
    private int numeroDeLampadas;
    private boolean usoDeAC;

    @Override
    public int getCarbonFootprint() {
        return 1;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public boolean isUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public int getNumeroDeLampadas() {
        return numeroDeLampadas;
    }

    public void setNumeroDeLampadas(int numeroDeLampadas) {
        this.numeroDeLampadas = numeroDeLampadas;
    }

    public boolean isUsoDeAC() {
        return usoDeAC;
    }

    public void setUsoDeAC(boolean usoDeAC) {
        this.usoDeAC = usoDeAC;
    }
}
