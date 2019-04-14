package com.d0x1n;

import javax.swing.*;
import java.awt.*;

public class MVC_View extends JFrame {
    Container containers;
    JButton multiplyButton;
    JTextField txtFieldFirstNumber, txtFieldSecondNumber, txtFieldResult;

    public MVC_View(MVC_Model model) {
        this.containers = getContentPane();
        setTitle("MVC Pattern - Multiply");
        setLayout(new FlowLayout());
        setSize(500,100);
        this.txtFieldFirstNumber = new JTextField("", 8);
        this.txtFieldSecondNumber = new JTextField("", 8);
        this.txtFieldResult = new JTextField(":)",8);
        this.multiplyButton = new JButton("multiply");

        this.containers.add(txtFieldFirstNumber);
        this.containers.add(txtFieldSecondNumber);
        this.containers.add(multiplyButton);
        this.containers.add(txtFieldResult);
        setVisible(true);
    }
}

