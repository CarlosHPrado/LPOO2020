public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa(1);
        Apartamento apartamento = new Apartamento(2);

        System.out.println(casa.calcularIPTU());
        System.out.println(apartamento.calcularIPTU());
    }
}
