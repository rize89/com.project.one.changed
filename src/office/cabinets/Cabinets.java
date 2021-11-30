package office.cabinets;

import office.cabinets.devices.Device;
import office.cabinets.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Cabinets {
    private List<Employee> employeeList = new ArrayList<>();
    private List<Device> deviceList = new ArrayList<>();

    public Cabinets() {
    }

    public List<Employee> getCabinetList() {
        return employeeList;
    }

    public void setCabinetList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    // добавить сотрудника в кабинет
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    // добавить девайс в кабинет
    public void addDevice(Device device){
        deviceList.add(device);
    }

    @Override
    public String toString() {
        return "Cabinets{" +
                "employeeList=" + employeeList +
                ", deviceList=" + deviceList +
                '}';
    }
}
