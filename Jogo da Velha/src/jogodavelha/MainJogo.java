package jogodavelha;

import java.util.Scanner;

public class MainJogo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        String posicao;
        int valida = 0;  // aux valida jogada
        int jogadas = 0; // contador de jogadas, 9 = velha

        jogo.Mostrar();
        while(true){
            System.out.println(" # # # # JOGO DA VELHA # # # # ");

// JOGADOR 1
            do{
                System.out.println("Jogador 1, posição: ");
                posicao = ler.next();

                while(!jogo.Valida(posicao)){
                    System.out.println("Jogada Invalida, tente outra posição!");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "X");
                valida = 1;

            }while(valida == 0);
// FIM JOGADOR 1

            jogadas++;
            valida = 0;
            jogo.Mostrar();

            if(!jogo.Ganhou(jogadas).equals("null")){
                break;
            }
// JOGADOR 2
            do{
                System.out.println("Jogador 2, posição: ");
                posicao = ler.next();

                while(!jogo.Valida(posicao)){
                    System.out.println("Jogada Invalida, tente outra posição!");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "O");
                valida = 1;

            }while(valida == 0);
// FIM JOGADOR 2

            jogadas++;
            valida = 0;
            jogo.Mostrar();

            if(!jogo.Ganhou(jogadas).equals("null")){
                break;
            }

        }
        System.out.println("VENCEDOR: " + jogo.Ganhou(jogadas));

    }
}
