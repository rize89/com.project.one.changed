package company.offices;

import company.cabinets.Cabinet;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<Cabinet> cabinetList = new ArrayList<>();

    public Office() {
    }

    public void addCabinet(Cabinet cabinet) {
        cabinetList.add(cabinet);
    }
}
