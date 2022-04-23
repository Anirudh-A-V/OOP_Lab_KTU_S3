// import javax.swing.*;
// import java.awt.event.*;

// public class CurrencyConverter extends JFrame implements ActionListener {
//     JButton convert;
//     JRadioButton D, E;
//     ButtonGroup bg;
//     JTextField t1, t2;
//     JLabel l1, l2;

//     CurrencyConverter() {
//         JFrame frame = new JFrame();

//         D = new JRadioButton("Dollar");
//         E = new JRadioButton("Euro");

//         bg = new ButtonGroup();

//         convert = new JButton("Convert");

//         t1 = new JTextField();
//         t2 = new JTextField();

//         l1 = new JLabel("Input : ");
//         l2 = new JLabel("Output : ");

//         // convert.setBounds(x, y, width, height);
//         D.setBounds(195, 200, 100, 30);
//         E.setBounds(195, 250, 100, 30);
//         convert.setBounds(180, 350, 100, 30);
//         t1.setBounds(150, 100, 200, 30);
//         t2.setBounds(150, 150, 200, 30);
//         l1.setBounds(50, 100, 100, 30);
//         l2.setBounds(50, 150, 100, 30);

//         bg.add(D);
//         bg.add(E);

//         // bg.add(convert);

//         frame.add(D);
//         frame.add(E);
//         frame.add(convert);
//         frame.add(t1);
//         frame.add(t2);
//         frame.add(l1);
//         frame.add(l2);

//         convert.addActionListener(this);

//         frame.setLayout(null);
//         frame.setSize(500, 500);
//         frame.setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if (D.isSelected()) {
//             // JOptionPane.showMessageDialog(this, "You are Male.");
//             Double INR = Double.valueOf(t1.getText());
//             // String str = String.valueOf(INR);
//             // t1.setText(" ₹ " + str);
//             double dollar = (INR / 76.43);
//             String str1 = String.valueOf(dollar);
//             t2.setText(" $ " + str1);
//         }
//         if (E.isSelected()) {
//             Double INR = Double.valueOf(t1.getText());
//             double euro = (INR / 83.53);
//             String str2 = String.valueOf(euro);
//             t2.setText(" € " + str2);
//         }
//     }

//     public static void main(String[] args) {
//         CurrencyConverter c = new CurrencyConverter();
//     }
// }
