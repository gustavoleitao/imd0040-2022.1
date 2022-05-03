package br.ufrn.imd.clazz;

public enum DiasSemana {

    DOMINGO(1), SEGUNDA(2),TERCA(3),QUARTA(4),QUINTA(5),SEXTA(6), SABADO(7);

    private int codigo;

    DiasSemana(int codigo) {
        this.codigo = codigo;
    }
}
