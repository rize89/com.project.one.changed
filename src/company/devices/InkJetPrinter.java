package company.devices;

import company.devices.interfaces.Condition;
import company.devices.interfaces.Print;

public class InkJetPrinter extends Device implements Print, Condition {

    public InkJetPrinter(int id, String name) {
        super(id, name);
    }

    @Override
    public void condition() {
        System.out.println("Printer: включен");
    }

    @Override
    public void print() {
        System.out.println("Printer: Идет струйная печать");
        System.out.println("-----------------------------");
    }
}
