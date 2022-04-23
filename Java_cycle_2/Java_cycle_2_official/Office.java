/**
 * This program is intended to understand the concept of Inheritance.
 * It takes input for classes Officer and Employee, which are the child 
 * of the class Employee. Then prints the entered data.
 * This program is written by Anirudh A V on Jan 25 2022.
 */

import java.util.Scanner;

class Employees {
    String name;
    int age;
    int ph;
    double salary;
    String adr;

    void printSalary() {
        System.out.println("\nThe salary of the employee is " + salary);
    }
}

class Officer extends Employees {
    String specialization;

    void newOfficer() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nPlease enter the name of the officer - ");
        this.name = sc.nextLine();
        System.out.printf("\nPlease enter the age of the officer - ");
        this.age = sc.nextInt();
        System.out.printf("\nPlease enter the phone number of the officer - ");
        this.ph = sc.nextInt();
        System.out.printf("\nPlease enter the salary of the officer - ");
        this.salary = sc.nextDouble();
        sc.nextLine();
        System.out.printf("\nPlease enter the address of the officer - ");
        this.adr = sc.nextLine();
        System.out.printf("\nPlease enter the specialization of the officer - ");
        this.specialization = sc.nextLine();
    }

    void printData() {
        System.out.println("\nOfficer name is " + name);
        System.out.println("Officer age is " + age);
        System.out.println("Officer phone number is " + ph);
        printSalary();
        System.out.println("Officer address is " + adr);
        System.out.println("Officer specialization is " + specialization);
    }
}

class Manager extends Employees {
    String department;

    void newManager() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nPlease enter the name of the employee - ");
        this.name = sc.nextLine();
        System.out.printf("\nPlease enter the age of the employee - ");
        this.age = sc.nextInt();
        System.out.println("\nPlease enter the phone number of the employee - ");
        this.ph = sc.nextInt();
        System.out.printf("\nPlease enter the salary of the employee - ");
        this.salary = sc.nextDouble();
        sc.nextLine();
        System.out.printf("\nPlease enter the address of the employee - ");
        this.adr = sc.nextLine();
        System.out.printf("\nPlease enter the department of the employee - ");
        this.department = sc.nextLine();
    }

    void printData() {
        System.out.println("\nManager name is " + name);
        System.out.println("Manager age is " + age);
        System.out.println("Manager phone number is " + ph);
        printSalary();
        System.out.println("Manager address is " + adr);
        System.out.println("Manager department is " + department);
    }
}

public class Office {
    public static void main(String args[]) {
        Manager m1 = new Manager();
        Officer off = new Officer();
        off.newOfficer();
        m1.newManager();
        off.printData();
        m1.printData();
    }
}
