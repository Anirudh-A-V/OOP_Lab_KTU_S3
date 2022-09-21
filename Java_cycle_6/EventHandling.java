/**
 * This program is intended to illustrate event handling in Java.
 * Note: This program is not part of the lab cycle, but is intended to boost the understanding of students
 * 
 * Question:
 * Write a Java program that illustrates event handling.
 * 
 * This program is written by Anirudh A V
 */

import java.awt.*;
import java.awt.event.*;

public class EventHandling extends Frame implements ActionListener {
    TextField tf;

    EventHandling() {

        // create components
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        // register listener
        b.addActionListener(this);// passing current instance

        // add components and set size, layout and visibility
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String args[]) {
        new EventHandling();
    }
}