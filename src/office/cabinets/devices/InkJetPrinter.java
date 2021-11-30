package office.cabinets.devices;


import office.cabinets.devices.interfaces.Print;

public class InkJetPrinter extends Devices implements Print {

    private String id;

    public InkJetPrinter(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println("Printer: Идет струйная печать");
        System.out.println("-----------------------------");
    }
}
