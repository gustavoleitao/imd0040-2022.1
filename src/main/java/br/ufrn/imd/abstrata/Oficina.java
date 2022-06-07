package br.ufrn.imd.abstrata;

public class Oficina {

    public Veiculo proximo() {
        int code = (int) (Math.random() * 1000);
        if (code % 2 == 0) {
            return new Automovel();
        } else {
            return new Bicicleta();
        }
    }

    public void manter(Veiculo v) {
        v.checkList();
        v.adjust();
        v.cleanup();
    }

    public static void main(String[] args) throws InterruptedException {
        Oficina o = new Oficina();
        while (true){
            Veiculo v = o.proximo();
            o.manter(v);
            Thread.sleep(5000);
        }

    }

}
