package br.ufrn.imd.map;

import java.util.HashMap;
import java.util.Map;

public class EstudoMap {

    public static void main(String[] args) {
        Map<String, Integer> mapPontos = new HashMap<>();
        mapPontos.put("davi", 10);
        mapPontos.put("larissa", 20);
//        mapPontos.put("davi", 15);

        var iphone = new Produto(2345754, 10, "Iphone 12");
        var monitor = new Produto(456789, 1000, "Monitor samsung");

        Map<String, Produto> mapProdutos = new HashMap<>();
        mapProdutos.put("smartphone", iphone);
        mapProdutos.put("monitor", monitor);

        System.out.println(mapPontos.get("davi"));

//        System.out.println(mapProdutos.get("naoexiste"));
        System.out.println(mapProdutos.get("monitor"));

        Map<Produto,Integer> mapInventario = new HashMap<>();
        mapInventario.put(iphone, 90);
        mapInventario.put(iphone, 100);
        mapInventario.put(monitor, 80);

        var quantidadeIphone = mapInventario.get(new Produto(2345754, 10, "Iphone 12"));
        System.out.println(quantidadeIphone);

        Integer a = 10;
        int b = 20;
        int c = a + b;

    }

}
