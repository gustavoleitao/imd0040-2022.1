package br.ufrn.imd.poliformismo;

public class Automovel extends Veiculo{

    @Override
    public void checkList() {
        System.out.println("Automovel.checklist");
    }

    @Override
    public void adjust() {
        System.out.println("Automovel.adjust");
    }

    @Override
    public void cleanup() {
        System.out.println("Automovel.cleanup");
    }
}
