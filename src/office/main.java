package office;

import office.cabinets.Cabinet;
import office.cabinets.Cabinets;
import office.cabinets.devices.Device;
import office.cabinets.devices.Devices;
import office.cabinets.employee.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Offices offices = new Offices();
        offices.addCabinet(new Cabinet("buh"));
        offices.addCabinet(new Cabinet("ur otdel"));
        offices.addCabinet(new Cabinet("menegment"));
        Cabinets cabinets = new Cabinets();
        cabinets.addEmployee(new Employee("da","eb","dv"));
        cabinets.addEmployee(new Employee("Ivan", "p", "s"));
        cabinets.addDevice(new Device("1231412"));

        offices.getOfficeList();

        // доделать хешмапы для вывода связки либо посмотреть, как выводить 2 списка, может переделать листы на мапы




        HashMap<Office, List<Cabinet>> officeList1 = new HashMap<>();

        HashMap<Cabinet, ArrayList<Employee>> cabinetListEmployees1 = new HashMap<>();

        HashMap<Cabinet, List<Devices>> cabinetListDevices1 = new HashMap<>();
    }
}
