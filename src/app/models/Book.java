package app.models;

import app.service.Printable;

public class Book implements Printable {

    private String name;
    private String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }

}
