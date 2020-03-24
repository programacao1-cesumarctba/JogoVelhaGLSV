package jogodavelha;

public class JogoDaVelha {

    private String[][] matriz = { {"7","8","9"},
                                  {"4","5","6"},
                                  {"1","2","3"} };

    public String Mostrar(){
        for(int li=0; li<3; li++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("    "+ matriz[li][col]);
            }
            System.out.println("\n");
        }
        return null;
    }

    public boolean Valida(String pos){
        for(int li=0; li<3; li++) {
            for (int col = 0; col < 3; col++) {
                if(matriz[li][col].equals(pos) )
                    return true;
            }
        }
        return false;
    }

    public void Jogada(String pos, String jgd){
        if(pos.equals("7"))
            matriz[0][0] = jgd;
        else if(pos.equals("8"))
            matriz[0][1] = jgd;
        else if(pos.equals("9"))
            matriz[0][2] = jgd;
        else if(pos.equals("4"))
            matriz[1][0] = jgd;
        else if(pos.equals("5"))
            matriz[1][1] = jgd;
        else if(pos.equals("6"))
            matriz[1][2] = jgd;
        else if(pos.equals("1"))
            matriz[2][0] = jgd;
        else if(pos.equals("2"))
            matriz[2][1] = jgd;
        else if(pos.equals("3"))
            matriz[2][2] = jgd;
    }

    public String Ganhou(int jogadas){
        String[] poss = new String[8];  //Possibilidades
        String vencedor = "null";
        if (jogadas == 9){
            vencedor = "- - - D E U  V E L H A ! ! ! - - -";
        }
        //horizontais
        poss[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
        poss[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
        poss[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
        //verticais
        poss[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
        poss[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
        poss[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];
        //diagonais
        poss[6] = matriz[2][0] + matriz[1][1] + matriz[0][2];
        poss[7] = matriz[0][0] + matriz[1][1] + matriz[2][2];

        for(int i=0; i<poss.length; i++){
            if(poss[i].equals("XXX"))
                vencedor = "Jogador 1";
            else if(poss[i].equals("OOO"))
                vencedor = "Jogador 2";
        }
        return vencedor;
    }



}
