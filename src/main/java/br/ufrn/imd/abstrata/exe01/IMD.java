package br.ufrn.imd.abstrata.exe01;

public class IMD {

    private static String tempDir;

    static {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("linux")){
            tempDir = "/var/log/";
        }else{
            tempDir = "C:/System32/logs";
        }

    }

    public void imprimir(){
        System.out.println("Chamou o imprimir");

    }

    public static void main(String[] args) {
        System.out.println("Iniciou");
        System.out.println(IMD.tempDir);
    }

}
