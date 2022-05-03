package br.ufrn.imd.heranca;

public class Principal {

    public static void main(String[] args) {
        RH rh = new RH();
        rh.fazerPagamento(new Funcionario("João"));
        rh.fazerPagamento(new Gerente("Gilberto"));
    }

}
