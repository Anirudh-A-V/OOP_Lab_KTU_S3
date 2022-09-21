/**
 * This program is intended to implement a Linked List in java.
 * Note: This program is not part of the lab cycle, but is intended to boost the understanding of students.
 * 
 * Question:
 * Write a Java program that implements a Linked List using collection framework.
 * 
 * This program is written by Anirudh A V
 */

import java.util.Scanner;

public class LinkedList {

    static class node {
        int value;
        node next;

        node(int d) {
            value = d;
            next = null;
        }
    }

    node start = null;

    public static LinkedList insert_beginning(LinkedList list, int data) {

        node Newnode = new node(data);
        if (list.start == null) {
            list.start = Newnode;
        } else {
            Newnode.next = list.start.next;
            list.start = Newnode;
        }

        return list;
    }

    public static LinkedList insert_end(LinkedList list, int data) {

        if (list.start == null) {
            System.out.println("The list is empty!!!");
        } else {
            node Newnode = new node(data);
            Newnode.next = null;

            node last = list.start;

            while (last.next != null) {
                last = last.next;
            }

            last.next = Newnode;
        }

        return list;
    }

    public static void traversal(LinkedList list) {

        int flag = 0;
        node temp = list.start;
        System.out.println("Linked list : ");

        while (temp.next != null) {
            System.out.printf("%d ", temp.value);
            temp = temp.next;
            flag = 1;
        }
        if (flag != 1) {
            System.out.println("List is empty!!");
        }

        
    }

    public static LinkedList delete(LinkedList list, int data) {

        if (list.start == null) {
            System.out.println("The list is empty!!!");
        } else {
            // node Newnode = new node(data);
            // Newnode.next = null;

            node temp1 = null, temp = list.start;
            // node temp1 = new node();
            while (temp.next != null) {
                temp1 = temp;
                temp = temp.next;
                if (temp.value == data) {
                    break;
                }
            }

            temp1.next = temp.next;
            temp = null;

            System.gc();

            // last.next = Newnode;
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        int choice, response = 1;
        do {
            System.out.println("\t\nM E N U");
            System.out
                    .println("1. Insert at beginning\n2. Insert at end\n3. Delete the given node\n4. Display\n5. Exit");
            System.out.printf("\n\t->");
            choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:
                    System.out.printf("Enter the data to be inserted at the front : ");
                    data = sc.nextInt();
                    insert_beginning(list, data);
                    break;

                case 2:
                    System.out.printf("Enter the data to be inserted at the end : ");
                    data = sc.nextInt();
                    insert_end(list, data);
                    break;

                case 3:
                    System.out.printf("Enter the data of the node to be deleted : ");
                    data = sc.nextInt();
                    delete(list, data);
                    break;

                case 4:
                    traversal(list);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (response == 1);
        sc.close();
    }
}