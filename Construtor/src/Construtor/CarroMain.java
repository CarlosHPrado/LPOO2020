package Construtor;

public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro(200,200,200,100,1,"modelo do banco","fabricante do banco","fabricante do motor","tipo do pneu","fabricante do pneu");
        Carro carro2= new Carro(200,200,200,100,2,"modelo do banco","fabricante do banco","fabricante do motor","tipo do pneu","fabricante do pneu");
        Carro carro3 = new Carro(200,200,200,100,3,"modelo do banco","fabricante do banco","fabricante do motor","tipo do pneu","fabricante do pneu");

        carro1.showCar();
        carro2.showCar();
        carro3.showCar();

    }
}


