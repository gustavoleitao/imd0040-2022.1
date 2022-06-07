package br.ufrn.imd.abstrata;

public  class Bicicleta extends Veiculo {

    @Override
    public void checkList() {
        System.out.println("Bicicleta.checkList");
    }

    @Override
    public void adjust() {
        System.out.println("Bicicleta.adjust");
    }

    @Override
    public void cleanup() {
        System.out.println("Bicicleta.cleanup");
    }


}
