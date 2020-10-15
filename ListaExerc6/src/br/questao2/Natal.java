package br.questao2;

public class Natal extends CartaoWeb {
    public Natal (String destinatario){
        this.destinatario =  destinatario;
    }

    public String retornarMensagem(String remetente){
        return "Querido "+this.destinatario +" \nFeliz Natal \n Ótimas Festas !!!"+remetente;
    }
}
