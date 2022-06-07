package br.ufrn.imd.poliformismo;

public class Operations {

    public void operate(int ...op){
        System.out.println("operating int");
        System.out.println(op);
        for (int item : op){
            System.out.println(item);
        }
    }

    public void operate(String op){
        System.out.println("operating string");
    }

    public void operate(int a, int b){
        System.out.println("operating two ints");
    }

    public static void main(String[] args) {
        var op = new Operations();
        op.operate(10);
        op.operate(2,3);
        op.operate(1,2,3,4,5,6,7,8,9);
        op.operate("Testando...");
        op.operate(3,4);
    }

}
