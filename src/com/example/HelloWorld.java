package com.example;
import java.lang.ClassNotFoundException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class HelloWorld {

    public static void main(String[] args){
        try{


            System.out.println("Connecting to Driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Successful");

        }
        catch(ClassNotFoundException ex){
            System.out.println("Error: " + ex.toString());
        }
    }
}
