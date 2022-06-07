package br.ufrn.imd.heranca;

public class Funcionario extends Pessoa {

    public Funcionario(String nome){
        super(nome);
    }

    public void receber(){
        System.out.println("Ganhando dinheiro...");
    }

    private double calcularSalario(){
        return Math.random();
    }

    public static void main(String[] args) {
        Pessoa func = new Funcionario("João");
        func.falar();
    }



}
