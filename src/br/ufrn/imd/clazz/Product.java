package br.ufrn.imd.clazz;

public class Product {

    private float price;
    private Color color;

    public Product(float price, Color color) {
        this.price = price;
        this.color = color;
    }

    public static void main(String[] args) {
        var prod1 = new Product(10, Color.RED);
        var prod2 = new Product(10, Color.BLACK);

        System.out.println(Color.RED.getCodigoHex());

//        Color red = Color.valueOf("invalido");
        var cores = Color.values();
        for (Color cor : cores){
            System.out.println(cor);
        }

    }

}
