/**
 * This program is intended to demonstrate the concept of method overriding.
 * This program is written by Anirudh A V on Jan 25 2022.
 */

class Employee {
    void display() {
        System.out.println("Inside Employee");
        return;
    }

    void calcSalary() {
        System.out.println("The salary of the employee is 10000");
        return;
    }
}

class Engineer extends Employee {

    
    void display() {
        System.out.println("Inside Engineer");
        return;
    }

    void calcSalary() {
        System.out.println("The salary of the employee is 20000");
        // Redirects to display of the parent class
        super.display();
        // Redirects to calcSalary() of the parent class
        super.calcSalary();
        return;
    }
}

public class EmployeeEngineer {
    public static void main(String args[]) {
        Engineer eng = new Engineer();
        eng.display();
        eng.calcSalary();
    }
}