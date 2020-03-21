/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelhaglsv;

/**
 *
 * @author Saulo Jr
 */
public class Jogador {
    
    private String nome;
    private String senha;
    private long placar;

    public Jogador(String nome, String senha, long placar) {
        this.nome = nome;
        this.senha = senha;
        this.placar = placar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getPlacar() {
        return placar;
    }

    public void setPlacar(long placar) {
        this.placar = placar;
    }
    
    
}
