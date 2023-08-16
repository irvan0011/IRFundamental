package com.bcafinance.Praktikum;

import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {

         String Speed = "";
         int Jumlah =0;
         int ascii;
         System.out.print("Masukkan Kata : ");
         Scanner scanner = new Scanner(System.in);
         Speed = scanner.nextLine();
         char [] chArr =Speed.toCharArray();
         for (int i=0;i<chArr.length;i++){
             ascii=chArr[i];
             if ((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)){
                 Jumlah += ascii;
             }
         }
         System.out.println(Jumlah);
    }
}
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on Decembersda 20, 2022
@Author ASUS a.k.a. Paul Christian
Java Developer
Created on 8/16/2023 10:54 AM
@Last Modified 8/16/2023 10:54 AM
Version 1.0
*/
