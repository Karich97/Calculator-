package com.calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radioButton1 = new JRadioButton("addition");
    private JRadioButton radioButton2 = new JRadioButton("multiplying");
    private JRadioButton radioButton3 = new JRadioButton("subtraction");
    private JRadioButton radioButton4 = new JRadioButton("division");
    private JCheckBox checkBox = new JCheckBox("Check", false);
    private int number = 1;

    public SimpleGUI(){
        super("Simple Example");
        Dimension screenPar = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((screenPar.width  - screenPar.height / 4) / 2, (screenPar.height  - screenPar.height / 4)/ 2,
                screenPar.width / 4,screenPar.height / 4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        if (number != 0){
            container.add(radioButton1);
            container.add(radioButton2);
            container.add(radioButton3);
            container.add(radioButton4);
        }

        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }
    public SimpleGUI(int number){
        super("Simple Example");
        this.number = number;
        Dimension screenPar = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((screenPar.width  - screenPar.height / 4) / 2, (screenPar.height  - screenPar.height / 4)/ 2,
                screenPar.width / 4,screenPar.height / 4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        if (number != 0){
            container.add(radioButton1);
            container.add(radioButton2);
            container.add(radioButton3);
            container.add(radioButton4);
        }

        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{

        public void actionPerformed (ActionEvent e){
            String message = "";
            if (number == 0){
                number = Integer.parseInt(input.getText());
                new SimpleGUI(number);
            }
            else {
                if (radioButton1.isSelected()){
                    message += number + Integer.parseInt(input.getText());
                    number = number + Integer.parseInt(input.getText());
                }
                else if (radioButton2.isSelected()){
                    message += number * Integer.parseInt(input.getText());
                    number = number * Integer.parseInt(input.getText());
                }
                else if (radioButton3.isSelected()){
                    message += number - Integer.parseInt(input.getText());
                    number = number - Integer.parseInt(input.getText());
                }
                else {
                    message += number / Integer.parseInt(input.getText());
                    number = number / Integer.parseInt(input.getText());
                }
            }
            JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}