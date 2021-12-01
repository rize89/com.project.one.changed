package company;

import company.cabinets.Cabinet;
import company.devices.*;
import company.employees.Employee;
import company.offices.Office;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cabinet cab1 = new Cabinet(1, "Топ менеджмент");
        Cabinet cab2 = new Cabinet(2, "Бухгалтерия");
        Cabinet cab3 = new Cabinet(3, "Отдел продаж");

        Device dev1 = new MFU(12415, "MFU#1");
        Device dev2 = new InkJetPrinter(51414, "Printer#1");
        Device dev3 = new Scanner(61677, "Scanner#1");

        Employee emp1 = new Employee("Васильков", "Василий", "Васильевич");
        Employee emp2 = new Employee("Сурков", "Игорь", "Дмитриевич");
        Employee emp3 = new Employee("Снежина", "Юлия", "Владимировна");
        Employee emp4 = new Employee("Бульков", "Павел", "Сергеевич");

        dev1.addDeviceToCabinet(cab1);
        dev2.addDeviceToCabinet(cab2);
        dev3.addDeviceToCabinet(cab3);

        emp1.addEmployeeToCabinet(cab1);
        emp2.addEmployeeToCabinet(cab2);
        emp3.addEmployeeToCabinet(cab3);
        emp4.addEmployeeToCabinet(cab3);

        List<Device> deviceList = new ArrayList<>();
        deviceList.add(dev1);
        deviceList.add(dev2);
        deviceList.add(dev3);
        System.out.println(deviceList); //вывод всех кабинетов с устройствами

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        System.out.println(employeeList); //вывод всех сотрудников с указанием их кабинетов

        Office office = new Office();
        office.addCabinet(cab1); // добавление кабинета в офис
        office.addCabinet(new Cabinet(4,"Аналитики"));

        Cabinet cab5 = new Cabinet(5,"Менеджеры");
        cab5.addDeviceToOffice(new MFU(1, "MFU-145HP")); // добавление устройства в кабинет
        cab5.addEmployeeToOffice(new Employee("Иванов", "Иван", "Иванович")); // добавление сотрудника в кабинет
    }
}
