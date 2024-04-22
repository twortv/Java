package Employees;

import java.util.ArrayList;

public class listEmployees {
    private ArrayList<Employee> list;

    public listEmployees() {
        this.list = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) {
            list.add(new Employee("NV" + i, "Tom " + i, 20 + i, "Department " + i, "Code " + i, 1000 + i * 100));
        }
    }

    public listEmployees(ArrayList<Employee> list) {
        this.list = list;

    }

    public void addEmployee(Employee epl) {
        this.list.add(epl);
    }

    public void viewListEmployees() {
        for (Employee epl : list) {
            System.out.println(epl);
        }
    }

    public boolean deleteEmployee(Employee epl) {
        return this.list.remove(epl);
    }

    public ArrayList<Employee> getList() {
        return list;
    }
}
