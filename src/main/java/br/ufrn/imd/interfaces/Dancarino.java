package br.ufrn.imd.interfaces;

public interface Dancarino {

    int n = 5;

    void dancar();

    default void cantar(){
        System.out.println(n);
    }

}
