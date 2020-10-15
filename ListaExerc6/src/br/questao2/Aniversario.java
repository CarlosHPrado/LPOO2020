package br.questao2;

public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }

    public String retornarMensagem(String remetente){
        return "Feliz Aniversário "+this.destinatario+"!!!\n Muitos Anos de Vida \n Ass.:"+ remetente;
    }
}
