package company.devices;

import company.cabinets.Cabinet;

import java.util.ArrayList;
import java.util.List;

public abstract class Device {
    private int id;
    private String name;
    private List<Cabinet> cabinetList = new ArrayList<>();

    public Device(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addDeviceToCabinet(Cabinet cabinet) {
        cabinetList.add(cabinet);
    }

    @Override
    public String toString() {
        return cabinetList +
                " {Устройство: " +
                "id=" + id +
                ", " + name +
                '}';
    }
}
