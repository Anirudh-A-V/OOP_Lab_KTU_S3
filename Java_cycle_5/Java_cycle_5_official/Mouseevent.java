/**
 * This program is for familiarizing with mouse events.
 * 
 * Question:
 * Write a Java program for handling mouse events.
 * 
 * This program is written by Anirudh A V
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouseevent extends JFrame implements MouseListener {
    Label l;

    Mouseevent() {
        addMouseListener(this);

        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new Mouseevent();
    }
}
