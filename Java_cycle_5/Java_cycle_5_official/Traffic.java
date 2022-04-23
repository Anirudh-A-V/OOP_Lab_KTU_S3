import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Traffic extends JFrame implements ActionListener {
    static JRadioButton red, yellow, green;
    static JTextField R, Y, G;
    // Thread t1;

    Traffic() {
    }

    public void actionPerformed(ActionEvent e) {
        // String s = e.getActionCommand();
        if (red.isSelected()) {
            R.setBackground(Color.RED);
            Y.setBackground(Color.WHITE);
            G.setBackground(Color.WHITE);
        }
        if (yellow.isSelected()) {
            R.setBackground(Color.WHITE);
            Y.setBackground(Color.YELLOW);
            G.setBackground(Color.WHITE);
        }
        if (green.isSelected()) {
            R.setBackground(Color.WHITE);
            Y.setBackground(Color.WHITE);
            G.setBackground(Color.GREEN);
        }
    }

    

    public static void main(String[] args) {
        Traffic trf = new Traffic();

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setBackground(Color.WHITE);
        f.setVisible(true);

        R = new JTextField();
        Y = new JTextField();
        G = new JTextField();

        R.setEditable(false);
        Y.setEditable(false);
        G.setEditable(false);
        // JButton[] lights = new JButton[3];

        R.setBounds(100, 30, 50, 30);
        Y.setBounds(200, 30, 50, 30);
        G.setBounds(300, 30, 50, 30);

        // R.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // Y.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // G.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        R.setBackground(Color.WHITE);
        Y.setBackground(Color.WHITE);
        G.setBackground(Color.WHITE);

        red = new JRadioButton("RED");
        yellow = new JRadioButton("YELLOW");
        green = new JRadioButton("GREEN");

        red.setBounds(200, 150, 80, 30);
        yellow.setBounds(190, 200, 80, 30);
        green.setBounds(195, 250, 80, 30);

        // JButton start = new JButton("START");
        // start.setBounds(95, 350, 110, 40);
        // start.addActionListener(trf);

        // JButton stop = new JButton("STOP");
        // stop.setBounds(245, 350, 110, 40);
        // stop.addActionListener(trf);

        ButtonGroup bg = new ButtonGroup();

        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        red.addActionListener(trf);
        yellow.addActionListener(trf);
        green.addActionListener(trf);

        f.add(R);
        f.add(Y);
        f.add(G);
        f.add(red);
        f.add(yellow);
        f.add(green);
        // f.add(start);
        // f.add(stop);

    }
}