package app.models;

import app.service.Fly;

public class Airplane implements Fly {

    private String name;
    private String company;

    public Airplane(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public void flying() {
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrr");
    }
}
