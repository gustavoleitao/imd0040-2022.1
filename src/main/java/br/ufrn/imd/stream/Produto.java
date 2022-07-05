package br.ufrn.imd.stream;

public class Produto implements Comparable<Produto>{

    double price;
    String name;

    public Produto(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Produto o) {
//        return name.compareTo(o.getName());
        return Double.compare(this.price, o.getPrice());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
