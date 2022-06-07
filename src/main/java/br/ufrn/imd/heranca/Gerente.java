package br.ufrn.imd.heranca;

public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public void receber(){
        System.out.println("recebendo do gerente...");
    }

}
