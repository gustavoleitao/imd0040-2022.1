package br.ufrn.imd.estatico;

public class Estatico {

    private static double PI;

    public void alterar(){
        this.PI = 10;
    }

    public void printPi(){
        System.out.println(PI);
    }

    public static void main(String[] args) {
        var est01 = new Estatico();
        var est02 = new Estatico();

        int valor = 10;
        String valorStr = String.valueOf(valor);

        Math.random();

        est01.printPi();
        est02.printPi();

        est01.alterar();

        est01.printPi();
        est02.printPi();


    }

}
