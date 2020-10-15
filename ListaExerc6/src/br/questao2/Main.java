package br.questao2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CartaoWeb[] a = new CartaoWeb[5];
        String s[] = new String[5];
        s[0] = JOptionPane.showInputDialog("Digite o Nome do Destinatario?");
        a[0] = new Natal(s[0]);
        a[2] = new Aniversario(s[0]);
        a[1] = new DiaDosNamorados(s[0]);

        s[1] = JOptionPane.showInputDialog("Remetente");
        for(int i =0; i<=a.length;i++){
            JOptionPane.showMessageDialog(null, a[i].retornarMensagem(s[1]));
        }
    }
}
