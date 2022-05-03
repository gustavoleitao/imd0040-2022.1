package br.ufrn.imd.heranca;

public class Pessoa {

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Construindo pessoa...");
    }

    public String nome;

    public void falar(){
        System.out.println("oi tudo bem?");
    }

}
