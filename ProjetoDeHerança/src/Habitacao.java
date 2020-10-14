public abstract class Habitacao {
    int numeroDeComodos;
    String endereco;

    public double calcularIPTU(){
        return (numeroDeComodos*100)/2;
    }
}