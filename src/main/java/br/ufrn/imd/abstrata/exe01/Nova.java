package br.ufrn.imd.abstrata.exe01;

public class Nova {

    public enum Tonalidade {
        GRAY("83748"), BLUE("fjdhfj");

        public String hexCode;

        Tonalidade(String hexCode) {
            this.hexCode = hexCode;
        }

    }

    private Tonalidade tom;

    public Nova(Tonalidade tom) {
        this.tom = tom;
        System.out.println(tom.hexCode);
    }


}
