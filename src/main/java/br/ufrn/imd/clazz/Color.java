package br.ufrn.imd.clazz;

public enum Color {

    RED("#FF0000"),BLACK("#000000"),BLUE("#0000FF");

    private String codigoHex;

    Color(String codigo){
        this.codigoHex = codigo;
    }

    public String getCodigoHex() {
        return codigoHex;
    }
}
