
package com.mycompany.assignment1;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException{
        System.out.println("Hi, Welcome to real time assignment1.");
        System.out.println("Loding......");
        Data.collectData();
        Excel.excel();
        
    } 
}