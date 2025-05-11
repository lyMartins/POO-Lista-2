package Questão6Lista2;

public class Pessoa {
    private String nome;
    Pessoa pai, mae;

    public Pessoa(Pessoa pai, Pessoa mae, String nome) {
        this.pai = pai;
        this.mae = mae;
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.pai = null;
        this.mae = null;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public boolean igualdade(Pessoa outro){
        if (nome.equals(outro.getNome()) && mae.equals(outro.getMae())){
            return true;
        }
        else {
            return false;
        }
    }

}
