package app.models;

import app.service.Printable;

public class Journal implements Printable {
    private String name;

    String getName() {
        return name;
    }

    public Journal(String name) {

        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
