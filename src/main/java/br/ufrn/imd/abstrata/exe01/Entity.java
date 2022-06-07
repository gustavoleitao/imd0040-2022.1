package br.ufrn.imd.abstrata.exe01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Entity {

    public abstract String fileName();

    public abstract boolean validar();

    public final boolean salvar(){
        if (validar()){
            return saveFile();
        }else{
            System.err.println("Invalid entity");
            return false;
        }
    }

//    public static void open(){
//
//    }

    private boolean saveFile(){
        try {
            FileOutputStream f = new FileOutputStream(fileName());
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(this);
        } catch (IOException e) {
            return false;
        }
        return true;
    }



}
