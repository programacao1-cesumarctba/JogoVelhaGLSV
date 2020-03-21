
package jogovelhaglsv;

public class logicaJogo extends Jogador{
    private long placarX;
    private long placary;
    private int jogada;
    private int campo;
    private int turno;

    public logicaJogo(String nome, String senha, long placar) {
        super(nome, senha, placar);
    }
   
    public long getPlacarX() {
        return placarX;
    }

   
    public void setPlacarX(long placarX) {
        this.placarX = placarX;
    }

    public long getPlacary() {
        return placary;
    }

    public void setPlacary(long placary) {
        this.placary = placary;
    }

    public int getJogada() {
        return jogada;
    }
   
    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public int getCampo() {
        return campo;
    }

    public void setCampo(int campo) {
        this.campo = campo;
    }
}
