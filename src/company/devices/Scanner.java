package company.devices;

import company.devices.interfaces.Condition;
import company.devices.interfaces.Scan;

public class Scanner extends Device implements Scan, Condition {

    public Scanner(int id, String name) {
        super(id, name);
    }

    @Override
    public void condition() {
        System.out.println("Scanner: включен");
    }

    @Override
    public void scan() {
        System.out.println("Scanner: идет сканирование");
        System.out.println("-----------------------------");
    }
}
