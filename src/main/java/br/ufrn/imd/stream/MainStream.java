package br.ufrn.imd.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        Collection<Integer> lista = Arrays.asList(2,3,4,5,6);
        lista.stream().filter(x -> x > 3).forEach(System.out::println);

        System.out.println("-----");

        Integer element = lista.stream().findAny().get();
        System.out.println(element);

        System.out.println("-----");

        Stream<String> intStream = Stream.of("Olá", "Mundo");
        intStream.map(i -> i.length()).forEach(System.out::println);

        System.out.println("-----");

        List<List<Integer>> listOfListofInts = Arrays
                .asList(Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList( 7, 8, 9));

        listOfListofInts.stream().flatMap(List::stream).forEach(System.out::println);

        System.out.println("-----");

        List<List<List<Integer>>> multi = Arrays
                .asList(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3),Arrays.asList(1, 2, 3)),
                        Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)),
                        Arrays.asList( Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)));

        multi.stream().flatMap(List::stream).flatMap(List::stream).forEach(System.out::println);

        System.out.println("-----");

        List<Produto> produtos = Arrays.asList(new Produto(900,"A mesa"), new Produto(100, "Cadeira"));

        produtos.stream().sorted()
                .forEach(System.out::println);

        System.out.println("-----");

        produtos.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
                .forEach(System.out::println);

        Arrays.asList("oi", "tudo", "bem").forEach(o -> System.out.println(o));

        System.out.println("-----");

        Stream<Integer> allMatch = Stream.of(1, 2, 3, 4, 5, 10);
        boolean result = allMatch.filter(x -> x > 9).allMatch(c -> c == 10);
        System.out.println(result);

        System.out.println("---");

        Stream<Integer> coletandoLista = Stream.of(1, 2, 3, 4, 5, 10);

        List<Integer> listaResultado = coletandoLista
                .filter(x -> x >= 5)
                .collect(Collectors.toList());

        System.out.println(listaResultado);

        System.out.println("---");

        List<Integer> entrada = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> saida = new ArrayList<>();
        for (Integer i : entrada){
            if (i >= 5){
                saida.add(i);
            }
        }

        System.out.println("---");

        Map<Integer, Book> map = getBooks().stream()
                .filter(b -> b.ano() < 1956)
                .collect(Collectors.toMap(Book::ano, Function.identity(), (anterior, atual) -> anterior));

        System.out.println(map);

    }

    public static List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        return bookList;
    }

}
