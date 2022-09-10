package com.utel.poo.practica1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    private JTextField display;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDiv;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMulti;
    private JButton btnMin;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btn0;
    private JButton btnEq;
    private JButton btnAdd;
    private JPanel mainPanel;

    public CalculadoraGUI() {
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementación de operaciones
            }
        });
    }
}
