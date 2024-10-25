package app.models;

public class Printer extends Device{

    private String company;

    public Printer(String name, String company) {
        super(name);
        this.company = company;
    }


    @Override
    public void devicePrint() {
        System.out.println(Printer.class.getName() + " printing, company= " + company);
    }
}
