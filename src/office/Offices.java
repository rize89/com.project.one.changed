package office;

import office.cabinets.Cabinet;

import java.util.ArrayList;
import java.util.List;

public class Offices {
    private List<Cabinet> officeList = new ArrayList<>();

    public Offices() {
    }

    public void setOfficeList(List<Cabinet> officeList) {
        this.officeList = officeList;
    }

    public List<Cabinet> getOfficeList() {
        return officeList;
    }

    // добавить кабинет в офис
    public void addCabinet(Cabinet cabinet){
        officeList.add(cabinet);
    }

    @Override
    public String toString() {
        return "Offices{" +
                "officeList=" + officeList +
                '}';
    }
}
