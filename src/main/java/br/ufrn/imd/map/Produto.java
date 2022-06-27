package br.ufrn.imd.map;

import java.util.Objects;

public class Produto {

    private int sku;
    private double price;
    private String name;

    public Produto(int sku, double price, String name) {
        this.sku = sku;
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku=" + sku +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return sku == produto.sku;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }
}
