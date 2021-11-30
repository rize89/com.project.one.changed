package office.cabinets.employee;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList = new ArrayList<>();

    public Employees() {
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getListEmployee() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeList=" + employeeList +
                '}';
    }
}
