/**
 * This program is intended to demonstrate the concept of method overriding.
 * 
 * Question:
 * Write two Java classes Employee and Engineer. Engineer should inherit from Employee
 * class. Employee class to have two methods display() and calcSalary(). Write a program to
 * display the engineer salary and to display from Employee class using a single object in-
 * stantiation (i.e., only one object creation is allowed).
 *      ->  display() only prints the name of the class and does not return any value. Ex. “ Name
 *          of class is Employee.”
 *      ->  calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in
 *          Engineer displays “Salary of employee is 20000.”
 * 
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