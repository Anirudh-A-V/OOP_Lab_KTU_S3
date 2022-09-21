/**
 * This program is intended to design an employee management system.
 * 
 * Question :
 * To Write a program by creating an 'Employee' class having the 
 * following methods and printing the final salary.
 *      1 - 'getInfo()' which takes the salary and number of hours of
 *          work per day of the employee as a parameter.
 *      2 - 'AddSal()' which adds $10 to the salary of the employee if
 *          it is less than $500.
 *      3 - 'AddWork()' which adds $5 to the salary of the employee if
 *          the number of hours of work per day is more than 6 hours
 * 
 * This program is written by Anirudh A V
 */

import java.util.Scanner;

public class Employee {
    int Salary;
    int work_per_day;

    void getInfo(int sal, int work) {
        this.Salary = sal;
        this.work_per_day = work;
    }

    void AddSal() {
        if (Salary < 500) {
            System.out.println("Since the Salary is less than $500, $10 is added!");
            Salary = Salary + 10;
        }
    }

    void AddWork() {
        if (work_per_day > 6) {
            System.out.println("Since the no. of working hours is more than 6, $5 is added!");
            Salary = Salary + 5;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary of the Employee");
        int sal = sc.nextInt();
        System.out.println("Enter the number of work hours per day of the Employee");
        int work = sc.nextInt();
        Employee em = new Employee();
        em.getInfo(sal, work);
        int response = 1, choice;
        do {
            System.out.println("\t\nM E N U");
            System.out.println("1. Low Salary\n2. More Work\n3. Print final Salary\n4. Exit");
            System.out.printf("\n\t->");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    em.AddSal();
                    break;

                case 2:
                    em.AddWork();
                    break;

                case 3:
                    System.out.println("The final Salary is " + em.Salary);
                    break;

                case 4:
                    System.out.println("\n\tTerminating Program....\n");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (response == 1);
        sc.close();
    }
}
