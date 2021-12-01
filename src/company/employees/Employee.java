package company.employees;

import company.cabinets.Cabinet;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;

    private List<Cabinet> cabinetList = new ArrayList<>();

    public Employee(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public void addEmployeeToCabinet(Cabinet cabinet) {
        cabinetList.add(cabinet);
    }

    @Override
    public String toString() {
        return "Сотрудник: " + surname +
                ", " + name +
                ", " + patronymic +
                " - " + cabinetList;
    }
}
