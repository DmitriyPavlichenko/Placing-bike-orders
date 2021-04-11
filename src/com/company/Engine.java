package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {
    OrderWindow parent;

    Engine(OrderWindow parent) {this.parent = parent;}

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            showValidity();
        } catch (TooManyBicyclesException | NumberFormatException ex) {
            parent.setValue("Something went wrong: " + ex.getMessage());
        }
    }

    void showValidity() throws TooManyBicyclesException {
        if (Double.parseDouble(parent.getDisplayValue()) > 100) {
            throw new TooManyBicyclesException("> 100");
        }

        String[] bikeName = parent.getBikeName();
        if (parent.getSelectedIndex() == 0) {
            parent.setValue("Order's valid: " + bikeName[0] + ": " + parent.getDisplayValue());
            // Request to database
        } else if (parent.getSelectedIndex() == 1) {
            parent.setValue("Order's valid: " + bikeName[1] + ": " + parent.getDisplayValue());
            // Request to database
        } else if (parent.getSelectedIndex() == 2) {
            parent.setValue("Order's valid: " + bikeName[2] + ": " + parent.getDisplayValue());
            // Request to database
        } else if (parent.getSelectedIndex() == 3) {
            parent.setValue("Order's valid: " + bikeName[3] + ": " + parent.getDisplayValue());
            // Request to database
        }
    }
}
