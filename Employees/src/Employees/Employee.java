package Employees;

public class Employee {
    private String id, name, department, code;
    private int age, salaryRate;

    public Employee(String id, String name, int age, String department, String code, int salaryRate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.code = code;
        this.age = age;
        this.salaryRate = salaryRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(int salaryRate) {
        this.salaryRate = salaryRate;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", code=" + code + ", age="
                + age + ", salaryRate=" + salaryRate + "]";
    }

}
