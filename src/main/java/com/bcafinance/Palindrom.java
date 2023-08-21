package com.bcafinance;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        palTest();

    }

    public static void palTest() {
        Scanner sc = new Scanner(System.in);
        String strInput = "";
        System.out.println("-------------------------------");
        System.out.print("Masukkan 1 kata : ");
        strInput = sc.nextLine();

        /*
            Mangga
            Kodok
         */

        char [] chinput = strInput.toCharArray();
        /*
            {'K','o','d','O','k'}
        */
        int intLen = chinput.length;
        String strTemp = "";
        for(int i=intLen-1;i>=0;i--)
        {
            strTemp += chinput[i];
        }
        if(strInput.equalsIgnoreCase(strTemp))
        {
            System.out.println("Ini adalah Palindrom");
            palTest();
        }else {
            System.out.println("Bukan Palindrom !!");

            palTest();
        }
    }

}
