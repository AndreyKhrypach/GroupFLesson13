package app;

import app.models.*;
import app.service.Fly;
import app.service.Printable;

public class Lesson13Program {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing 737", "Boeing");
        Mosquito mosquito = new Mosquito("Mosquito");

        Fly[] flies = new Fly[]{airplane, mosquito};


//        Fax fax = new Fax("fax", 1234567);
//        fax.defaultPrint();
//        Printer printer = new Printer("printer", "Hp");
//        deviceStatus(fax);
//        deviceStatus(printer);
//
//        Device superFax = new Fax("Super fax", 234567);
//        deviceStatus(superFax);
//        ((Fax)superFax).getSerialNumber();

//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();
//
//        Book book = new Book("Java for impatients", "Cay Horstmann");
//        Journal journal = new Journal("Java Dayly News");
//        read(book);
//        read(journal);

//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Journal("Java Dayly News"));

//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();      //  Java. Complete Reference (H. Shildt)
//        printable = new Journal("Foreign Policy");
//        printable.print();      // Foreign Policy

//        Fly airplane = new Airplane("Boeing 737", "Boeing");
//        Fly mosquito = new Mosquito("Mosquito");
//
//        airplane.flying();
//        mosquito.flying();
//
//        System.out.println(((Airplane) airplane).getName());

//        WaterPipe pipe = new WaterPipe();
//        pipe.printState(-1);

//        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
//        b1.print();

//        Device fax  = new Fax("fax", 1234567);
//        Device printer = new Printer("printer", "HP");
//        fax.devicePrint();
//        printer.devicePrint();

        //Device device = new Device("Test device");
//        device.devicePrint();
    }

    private static void deviceStatus(Device device) {
        device.devicePrint();
    }

    private static void read(Printable printable) {
        printable.print();
    }

    private static Printable createPrintable(String name, boolean option) {
        if (option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}
