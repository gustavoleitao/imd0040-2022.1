package br.ufrn.imd.lista;

import java.util.*;

public class Lista {

    public double media(Collection<Integer> elements){
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(0, 1);
        lista.add(3, 1);
        lista.add(4, 2);

        for (Integer element : lista){
            System.out.println(element);
        }

        var it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        it.next();

    }

}
