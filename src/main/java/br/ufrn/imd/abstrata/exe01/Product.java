package br.ufrn.imd.abstrata.exe01;

public class Product extends Entity {

    private final String name;
    private final double price;
    private final double PI = 3.14;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void calcular(){
        var x = PI *2;
    }

//    public static boolean open(){
//        return false;
//    }

//    public static void open(){
//        if (PI > 0){
//
//        }
//    }

    @Override
    public String fileName() {
        return "product-" + getName();
    }

    @Override
    public boolean validar() {
        return price > 0 && !name.isEmpty();
    }
}
