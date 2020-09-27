public class Retangulo {
    float largura, comprimento;

    public Retangulo() {
        this.largura = 0;
    }

    public Retangulo(float largura) {
        this.largura = largura;
    }

    public Retangulo(float largura,float altura) {
        this.largura = largura;
        this.comprimento=altura;
    }

    public void getComprimento() {
        if(comprimento>20 || comprimento<0){
            System.out.println("tamanho errado para um triangulo");
        } else {
            System.out.println(this.comprimento);
        }
    }

    public void setComprimento(float comprimento) {
        if(comprimento>20 || comprimento<0){
            System.out.println("tamanho errado para um triangulo");
        } else {
            this.comprimento = comprimento;
        }
    }

    public void getLargura() {
        if(largura>20 || largura<0){
            System.out.println("tamanho errado para um triangulo");
        } else {
            System.out.println(this.largura);
        }
    }

    public void setLargura(float largura) {
        if(largura>20 || largura<0){
            System.out.println("tamanho errado para um triangulo");
        } else {
            this.largura = largura;
        }
    }

    public float calcularPerimetro(){
        return 2*(this.largura + this.comprimento);
    }

}
