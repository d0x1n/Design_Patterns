package com.d0x1n;

public class Main {

    public static void main(String[] args) {

        MVC_Model model = new MVC_Model();
        MVC_View view = new MVC_View(model);
        new MVC_Controller(view, model);
    }
}
