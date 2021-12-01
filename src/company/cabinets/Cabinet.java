package company.cabinets;

import company.devices.Device;
import company.employees.Employee;

import java.util.ArrayList;
import java.util.List;

public class Cabinet {
    private int id;
    private String name;
    private List<Employee> employeeList = new ArrayList<>();
    private List<Device> deviceList = new ArrayList<>();

    public void addEmployeeToOffice(Employee employee) {
        employeeList.add(employee);
    }

    public void addDeviceToOffice(Device device) {
        deviceList.add(device);
    }

    public Cabinet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кабинет " +
                "№ " + id +
                ", " + name;
    }
}
