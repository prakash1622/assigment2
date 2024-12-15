package com.yourname.assignment;

public class AssignmentMain {
	public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 85000, "HR");
        Developer developer = new Developer("Bob", 102, 75000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(developer);
    }

}
