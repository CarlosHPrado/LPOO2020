
import javax.swing.JOptionPane;

public class ExercicioJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        String nome;

        nome = JOptionPane.showInputDialog(null,"Digite o nome");

        idade= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Idade"));

        if(idade > 18){
            JOptionPane.showMessageDialog(null,nome+" Você pode Tirar CNH","Resposta",JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,nome+" Você ainda não pode tira CNH, você tem apenas "+idade+" anos","Resposata",JOptionPane.WARNING_MESSAGE);
        }

    }
}