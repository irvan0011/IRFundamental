package com.bcafinance;

public class Exception /*throws java.lang.Exception */ {

    public static void main(String[] args)/*throws java.lang.Exception */{

        String username = "admin";
        String password = "admin";
        String usernameDB = "admindb";
        String passwordDB = "passwordDB";

        if (!username.equals(usernameDB) && !password.equals(passwordDB)){
//           throw new java.lang.Exception("Username/Password Salah!");
        }
        System.out.println("Anda Telah Login");
    }
}
