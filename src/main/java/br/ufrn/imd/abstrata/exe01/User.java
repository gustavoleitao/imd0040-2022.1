package br.ufrn.imd.abstrata.exe01;

public class User extends Entity {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String fileName() {
        return "user-" + name;
    }

    @Override
    public boolean validar() {
        return name.length() > 5;
    }
}
