package br.ufrn.imd.heranca;

public class Pessoa {
    public String nome;

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Construindo pessoa...");
    }

    public void falar(){
        System.out.println("oi tudo bem?");
    }
}
