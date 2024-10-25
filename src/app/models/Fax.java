package app.models;

public class Fax extends Device {

    private int serialNumber;

    public Fax(String name, int serialNumber) {
        super(name);
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

//    @Override
//    public void defaultPrint(){
//        System.out.println("i am printing");
//    }

    @Override
    public void devicePrint() {
        System.out.println(super.getName() + " printing sn= " + serialNumber);
    }
}
