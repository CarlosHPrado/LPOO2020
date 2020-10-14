public class Apartamento extends Habitacao{
    double valorCondominio;

    public Apartamento(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularIPTU() {
        return valorCondominio*3;
    }
}
