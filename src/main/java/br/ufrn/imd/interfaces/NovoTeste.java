package br.ufrn.imd.interfaces;

public interface NovoTeste {

    int n = 5;

    default void test(){
        System.out.println(n);
    }

}
