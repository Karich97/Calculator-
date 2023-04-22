package com.calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    private final JTextField input = new JTextField("", 5);
    private final JRadioButton radioButton1 = new JRadioButton("addition");
    private final JRadioButton radioButton2 = new JRadioButton("multiplying");
    private final JRadioButton radioButton3 = new JRadioButton("subtraction");
    private final JRadioButton radioButton4 = new JRadioButton("division");
    private int number = 0;

    public SimpleGUI(){
        super("Simple Example");
        Dimension screenPar = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((screenPar.width  - screenPar.height / 4) / 2, (screenPar.height  - screenPar.height / 4)/ 2,
                screenPar.width / 4,screenPar.height / 4);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,2,1,1));
        JLabel label = new JLabel("Input:");
        container.add(label);
        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        radioButton1.setSelected(true);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        container.add(radioButton1);
        container.add(radioButton2);
        container.add(radioButton3);
        container.add(radioButton4);

        JButton button = new JButton("Press");
        button.addActionListener(new ButtonEventListener ());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{

        public void actionPerformed (ActionEvent e){
            String message = "";
            try {
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
                JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
            }
            catch (Exception ex){
                message = "Use Integer variables";
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, message, "output", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}