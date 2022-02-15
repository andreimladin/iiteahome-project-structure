package com.facebook.ui;

import com.facebook.controllers.LoginController;

public class LoginUI {

    private LoginController loginController;

    public void login() {
        System.out.println("1. Username: ");
        // String username = read from keyoard username
        System.out.println("2. Password");
        // String password = read from keyoard password

        loginController.login("username", "password");
    }
}
