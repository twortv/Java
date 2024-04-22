package Main;

import java.util.Scanner;

import Employees.Employee;
import Employees.listEmployees;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listEmployees le = new listEmployees();
        int opt = 0;

        do {
            System.out.println("Select option:");
            System.out.println(
                    "1. View list employees. \n"
                            + "2. Add employee.\n"
                            + "3. Delete employee.\n"
                            + "4. Exit.");

            opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1) {
                System.out.println("List of employees:");
                le.viewListEmployees();

            } else if (opt == 2) {
                System.out.println("Enter employee information:");
                System.out.println("Id:");
                String id = sc.nextLine();
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Department:");
                String department = sc.nextLine();
                System.out.println("Code:");
                String code = sc.nextLine();
                System.out.println("Salary rate:");
                int salaryRate = sc.nextInt();

                Employee epl = new Employee(id, name, age, department, code, salaryRate);
                le.addEmployee(epl);
            } else if (opt == 3) {
                System.out.println("Enter ID of the employee you want to delete:");
                String idToDelete = sc.nextLine();
                Employee employeeToDelete = null;
                // Tìm nhân viên trong danh sách có ID trùng khớp
                for (Employee emp : le.getList()) {
                    if (emp.getId().equals(idToDelete)) {
                        employeeToDelete = emp;
                        break;
                    }
                }
                // Nếu tìm thấy, xóa nhân viên đó khỏi danh sách
                if (employeeToDelete != null) {
                    le.deleteEmployee(employeeToDelete);
                    System.out.println("Employee with ID " + idToDelete + " has been deleted.");
                } else {
                    System.out.println("Employee with ID " + idToDelete + " not found.");
                }
            }
        } while (opt != 4);
    }
}
