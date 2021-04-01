package com.calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radioButton1 = new JRadioButton("Select");
    private JRadioButton radioButton2 = new JRadioButton("Select");
    private JCheckBox checkBox = new JCheckBox("Check", false);

    public SimpleGUI(){
        super("Simple Example");
        this.setBounds(100, 100, 250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        container.add(radioButton1);
        radioButton1.setSelected(true);
        container.add(radioButton2);

        button.addActionListener(new ButtonEventListener ());
        container.add(checkBox);
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "";
            message += "Button was pressed\n Text is " + input.getText() + "\n";
            message += (radioButton1.isSelected() ? "Radio1 is " : "Radio2 is " + "selected");
            message += "\n" + "Checkbox is " + (checkBox.isSelected()? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}