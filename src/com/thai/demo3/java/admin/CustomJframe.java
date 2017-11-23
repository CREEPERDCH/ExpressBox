package com.thai.demo3.java.admin;


import javax.swing.*;

public class CustomJframe extends JFrame {

    private static CustomJframe customJframe;

    public static CustomJframe getSingleton() {
        if (customJframe == null) {
            synchronized (CustomJframe.class) {
                if (customJframe == null) {
                    customJframe = new CustomJframe();
                }
            }
        }
        return customJframe;
    }

    private CustomJframe() {

    }

}
