package com.company;

import javax.swing.*;
import java.awt.GridLayout;

public class OrderWindow extends JFrame {
    String[] bikeNames = {"Roadmaster", "Diamondblack", "Mongoose", "Zesty Trail"};
    JTextField text;
    JComboBox<String> box;
    JLabel textField3;

    OrderWindow() {
        super("Placing bike order");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout (3, 2));


        JLabel textField1 = new JLabel("Select model:");
        panel.add(textField1);

        box = new JComboBox<>(bikeNames);
        box.setSelectedIndex(0);
        panel.add(box);

        JLabel textField2 = new JLabel("Quantity:");
        panel.add(textField2);

        text = new JTextField();
        panel.add(text);

        JButton button = new JButton("Order");
        panel.add(button);

        textField3 = new JLabel("");
        panel.add(textField3);

        Engine engine = new Engine(this);
        button.addActionListener(engine);

        setContentPane(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getSelectedIndex() { return box.getSelectedIndex(); }

    public String getDisplayValue() {
        return text.getText();
    }

    public void setValue(String text) { textField3.setText(text); }

    public String[] getBikeName() {
        return bikeNames;
    }

}
