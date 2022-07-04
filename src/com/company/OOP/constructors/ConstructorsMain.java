package com.company.oop.constructors;

import com.company.oop.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {

        Employee employee = new Employee("Alex", "Software Engineer", 1000);
        Employee employee1 = new Employee("Serg", "Software Engineer", 1000);

        System.out.println(employee);
        System.out.println(employee1);
    }
}
