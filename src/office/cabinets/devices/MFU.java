package office.cabinets.devices;

import office.cabinets.devices.interfaces.Copy;
import office.cabinets.devices.interfaces.Print;
import office.cabinets.devices.interfaces.Scan;

public class MFU extends Devices implements Print, Scan, Copy {

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
