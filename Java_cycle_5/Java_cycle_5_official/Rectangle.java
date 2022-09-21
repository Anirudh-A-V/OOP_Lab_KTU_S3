/**
 * Note: This program was originally intended to familiarise the concept of applet in java.
 *       However, java applets are deprecated since java 9, this program is now a simple 
 *       paint program.
 * 
 * Question:
 * Write a Java program that allows the user to draw lines, rectangles and ovals.
 * 
 * This program is written by Anirudh A V
 */

import javax.swing.*;
import java.awt.*;

class mycanvas extends JComponent {
    public void paint(Graphics g){
        g.drawRect(40, 40, 120, 80);
        g.drawOval(40, 200, 120, 80);
        g.drawLine(200, 40, 200, 240);
    }
    
}

public class Rectangle extends JFrame {
    public static void main(String[] args) {
        JFrame F = new JFrame("Rectangle");
        F.setDefaultCloseOperation(EXIT_ON_CLOSE);
        F.setSize(400, 400);
        F.add(new mycanvas());
        F.setVisible(true);
    }
}
