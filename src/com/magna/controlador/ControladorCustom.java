package com.magna.controlador;

import com.magna.vistas.viewLogin;
import java.awt.Image;
import java.awt.Toolkit;

public class ControladorCustom {
    public static void main(String[] args) {
        viewLogin viewLogin = new viewLogin();
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("C:\\Users\\Santiago Alzate\\Documents\\NetBeansProjects\\bibliotecaMagna\\icon\\Bookmark.png"));
        viewLogin.setIconImage(retValue);    
    }
}
