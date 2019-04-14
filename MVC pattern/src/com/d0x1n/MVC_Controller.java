package com.d0x1n;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVC_Controller implements ActionListener {
    MVC_Model model;
    MVC_View view;

    public MVC_Controller(MVC_View view, MVC_Model model) {
        this.model = model;
        this.view = view;
        actionListenerMath(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            // retrieve input > JTextFields from MVC_View
            String firstNumber = view.txtFieldFirstNumber.getText();
            String secondNumber = view.txtFieldSecondNumber.getText();

            // call multiply method > MVC_Model
            int result = model.multiply(firstNumber, secondNumber);

            // display the result > MVC_View
            view.txtFieldResult.setText(String.valueOf(result));
        }
        catch (Exception exceptO) {
            exceptO.printStackTrace();
        }
    }

    public void actionListenerMath(ActionListener aMath) {
        view.multiplyButton.addActionListener(aMath);
    }
}
