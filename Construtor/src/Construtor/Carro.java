package Construtor;

public class Carro {

    double preco_banco, preco_motor, preco_pneu;
    int potencia_motor, id_carro;
    String modelo_banco, fabricante_banco, fabricante_motor, tipo_pneu,fabricante_pneu;
    Banco banco;
    Motor motor;
    Pneu pneu;

    public Carro(double preco_banco, double preco_motor, double preco_pneu, int potencia_motor, int id_carro, String modelo_banco, String fabricante_banco, String fabricante_motor, String tipo_pneu, String fabricante_pneu) {
        this.preco_banco = preco_banco;
        this.preco_motor = preco_motor;
        this.preco_pneu = preco_pneu;
        this.potencia_motor = potencia_motor;
        this.id_carro = id_carro;
        this.modelo_banco = modelo_banco;
        this.fabricante_banco = fabricante_banco;
        this.fabricante_motor = fabricante_motor;
        this.tipo_pneu = tipo_pneu;
        this.fabricante_pneu = fabricante_pneu;

        banco = new Banco(getPreco_banco(),getFabricante_banco(),getModelo_banco());
        motor = new Motor(getPotencia_motor(),getPreco_motor(),getFabricante_motor());
        pneu = new Pneu(getPreco_pneu(),getTipo_pneu(),getFabricante_pneu());
    }

    public double getPreco_banco() {
        return preco_banco;
    }

    public void setPreco_banco(double preco_banco) {
        this.preco_banco = preco_banco;
    }

    public double getPreco_motor() {
        return preco_motor;
    }

    public void setPreco_motor(double preco_motor) {
        this.preco_motor = preco_motor;
    }

    public double getPreco_pneu() {
        return preco_pneu;
    }

    public void setPreco_pneu(double preco_pneu) {
        this.preco_pneu = preco_pneu;
    }

    public int getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(int potencia_motor) {
        this.potencia_motor = potencia_motor;
    }

    public int getId_carro() {
        return id_carro;
    }

    public void setId_carro(int id_carro) {
        this.id_carro = id_carro;
    }

    public String getModelo_banco() {
        return modelo_banco;
    }

    public void setModelo_banco(String modelo_banco) {
        this.modelo_banco = modelo_banco;
    }

    public String getFabricante_banco() {
        return fabricante_banco;
    }

    public void setFabricante_banco(String fabricante_banco) {
        this.fabricante_banco = fabricante_banco;
    }

    public String getFabricante_motor() {
        return fabricante_motor;
    }

    public void setFabricante_motor(String fabricante_motor) {
        this.fabricante_motor = fabricante_motor;
    }

    public String getTipo_pneu() {
        return tipo_pneu;
    }

    public void setTipo_pneu(String tipo_pneu) {
        this.tipo_pneu = tipo_pneu;
    }

    public String getFabricante_pneu() {
        return fabricante_pneu;
    }

    public void setFabricante_pneu(String fabricante_pneu) {
        this.fabricante_pneu = fabricante_pneu;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public void showCar(){
        System.out.println("Informacoes do carro:"+this.id_carro+"\n"+"Fabricante do banco: "+banco.getFabricante()+" Modelo do banco: "+banco.getModelo()+" Preco do banco: "+banco.getPreco()+"\n"+"Potencia do motor: "+ motor.getPotencia()+" fabricante do motor: " + motor.getFabricante() +" preço do motor:" +motor.getPreco() +"\n"+"preço do pneu: "+ pneu.getPreco()+" fabricante do pneu: " + pneu.getFabricante() +" tipo do pneu; "+ pneu.getTipo() + "\n");
    }
}
