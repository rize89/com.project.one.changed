package company.devices;

import company.devices.interfaces.Condition;
import company.devices.interfaces.Copy;
import company.devices.interfaces.Print;
import company.devices.interfaces.Scan;

public class MFU extends Device implements Print, Scan, Copy, Condition {

    public MFU(int id, String name) {
        super(id, name);
    }

    @Override
    public void condition() {
        System.out.println("MFU: включен");
    }

    @Override
    public void copy() {
        System.out.println("MFU: идет копирование");
        System.out.println("-----------------------------");
    }

    @Override
    public void print() {
        System.out.println("MFU: идет лазерная печать");
        System.out.println("-----------------------------");
    }

    @Override
    public void scan() {
        System.out.println("MFU: идет сканирование");
        System.out.println("-----------------------------");
    }
}
