package office.cabinets.devices;

import office.cabinets.devices.interfaces.Scan;

public class Scanner extends Devices implements Scan {

    @Override
    public void scan() {
        System.out.println("Scanner: идет сканирование");
        System.out.println("-----------------------------");
    }
}
