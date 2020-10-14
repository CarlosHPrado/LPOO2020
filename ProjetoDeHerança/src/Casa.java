public class Casa extends Habitacao{
    int tamanhoQuintal;

    public Casa(int tamanhoQuintal) {
        this.tamanhoQuintal = tamanhoQuintal;
    }

    @Override
    public double calcularIPTU() {
        return tamanhoQuintal*3;
    }
}
