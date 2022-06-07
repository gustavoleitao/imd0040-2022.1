package br.ufrn.imd.abstrata.exe01;

public class Main {

    public static void main(String[] args) {
        Product tc = new Product("tv-lg", 2300);
        Product tsony = new Product("tv-sony", -10);

        boolean resultLg = tc.salvar();
        System.out.println("Salvou? "+resultLg);

//        Product.open();
//        Entity.open();

//        var tentity = new Entity();

        boolean resultSony = tsony.salvar();
        System.out.println("Salvou? "+resultSony);
    }

}
