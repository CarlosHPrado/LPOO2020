// import de bibliotecas
import jdk.internal.util.xml.impl.Input;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    // Startando variaveis
    static Scanner in;
    static String[] quadro;
    static String turno;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        quadro = new String[9];
        turno = "O";
        String vencedor = null;

        // Começando o jogo e iniciando um quadro vazio
        popularQuadroVazio();


        System.out.println("Olá, seja bem vido ao jogo da velha Tic Tac Toe");
        System.out.println("--------------------------------");
        printQuadro();
        System.out.println("O primeiro a jogar, será o 0 e em seguida será o de X");
        int numInput;

        // while para enquanto não houver vencedor, continuar a partida
        while (vencedor == null) {

            // tentar pegar um número inteiro, caso seja inserido um número diferente de 1 a 9, ele pedirá para repetir
            // e caso o input não seja um número, ele também pedirá para repetir
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Entrada de dados inválido, digite novamente outro valor:");
                    continue;
                }
            } catch (InputMismatchException e) {
                in.next();
                System.out.println("Entrada de dados inválido, digite novamente outro valor:");
                continue;
            }

            // Calcular de quem será o turno e o vencedor
            if (quadro[numInput-1].equals(String.valueOf(numInput))) {
                quadro[numInput-1] = turno;
                if (turno.equals("O")) {
                    turno = "X";
                } else {
                    turno = "O";
                }
                printQuadro();
                vencedor = checkWinner();
            } else {
                System.out.println("Essa casa já foi preenchida, por favor digite novamente outra");
                printQuadro();
                continue;
            }
        }

        // Se houver impate, printará que ouve empate, se não, irá falar qual foi o vencedor
        if (vencedor.equalsIgnoreCase("draw")) {
            System.out.println("Houve um empate, fim de jogo!");
        } else {
            System.out.println("Vencedor: " + vencedor);
        }
    }

    // Verificar o vencedor
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = quadro[0] + quadro[1] + quadro[2];
                    break;
                case 1:
                    line = quadro[3] + quadro[4] + quadro[5];
                    break;
                case 2:
                    line = quadro[6] + quadro[7] + quadro[8];
                    break;
                case 3:
                    line = quadro[0] + quadro[3] + quadro[6];
                    break;
                case 4:
                    line = quadro[1] + quadro[4] + quadro[7];
                    break;
                case 5:
                    line = quadro[2] + quadro[5] + quadro[8];
                    break;
                case 6:
                    line = quadro[0] + quadro[4] + quadro[8];
                    break;
                case 7:
                    line = quadro[2] + quadro[4] + quadro[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(quadro).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) return "draw";
        }

        System.out.println("Turno do: "+turno);
        return null;
    }

    // printar o quadro
    static void printQuadro() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + quadro[0] + " | " + quadro[1] + " | " + quadro[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + quadro[3] + " | " + quadro[4] + " | " + quadro[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + quadro[6] + " | " + quadro[7] + " | " + quadro[8] + " |");
        System.out.println("/---|---|---\\");
    }

    // popular o quadro vazio
    static void popularQuadroVazio() {
        for (int a = 0; a < 9; a++) {
            quadro[a] = String.valueOf(a+1);
        }
    }
}