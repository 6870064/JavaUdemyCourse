package com.company.oop.domainmodel;

public class Employee {

    private static int id;
    private int employeeID;
    private String name;
    private String position;
    private int salary;
    private String department;

    public Employee() {
    }

    public Employee(String name, String position, int salary) {
        this(name, position, salary, "IT");
        System.out.println("Constructor with 3 params called");
    }

    private Employee(String name, String position, int salary, String department) {
        employeeID = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("Constructor with 4 params called");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
