package br.ufrn.imd.interfaces;

public interface Cantor {

    String cantar();

    default void dancar2(){
        System.out.println("Dançando de forma padrão...");
    }

}
