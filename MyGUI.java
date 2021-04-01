package com.calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI extends JFrame{
    private JButton button = new JButton("=");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("0");
    private JButton buttonMark2 = new JButton("+");
    private JButton buttonMark3 = new JButton("-");
    private JCheckBox checkBox = new JCheckBox("Check", false);
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton buttonMark1 = new JButton(".");
    private JButton button0 = new JButton("0");

    public MyGUI(){
        super("Simple Example");
        this.setBounds(200, 200, 500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container containerOfInput = this.getContentPane();
        containerOfInput.setLayout(new GridLayout(1,4,2,2));
        containerOfInput.add(label);
        containerOfInput.add(input);

        Container containerOfNumbers = this.getContentPane();
        containerOfNumbers.setLayout(new GridLayout(4,3,2,2));
        containerOfNumbers.add(button1);
        containerOfNumbers.add(button2);
        containerOfNumbers.add(button3);
        containerOfNumbers.add(button4);
        containerOfNumbers.add(button5);
        containerOfNumbers.add(button6);
        containerOfNumbers.add(button7);
        containerOfNumbers.add(button8);
        containerOfNumbers.add(button9);
        containerOfNumbers.add(buttonMark1);
        containerOfNumbers.add(button0);

        Container containerOfMarks = this.getContentPane();
        containerOfNumbers.setLayout(new GridLayout(3,1,4,4));
        containerOfMarks.add(buttonMark1);
        containerOfMarks.add(buttonMark2);
        containerOfMarks.add(button);

        button.addActionListener(new ButtonEventListener ());

    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "Button was pressed";
            JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}