package br.questao2;

public class DiaDosNamorados extends CartaoWeb{

    public  DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }

    public String retornarMensagem(String remetente){

        return this.destinatario+" !!!\nTenha um Feliz Dia dos Namorados - \n Ass.: "+ remetente;
    }

}