package com.bcafinance.Ujian;

import java.util.Random;
import java.util.Scanner;

public class Ujian1 {


    /*
    Contoh Soal Ujian

    Buatlah sistem pengisian data contoh email yang dinamis dan sistem pengisian contoh nomor telepon dinamis acak
    */

    static Random random = new Random();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){

        System.out.println("Data apa yang anda butuhkan?");
        System.out.println("1. Data Email");
        System.out.println("2. Data No Handphone\n");
        System.out.print("Masukkan Pilihan : ");
        Scanner mainScanner = new Scanner(System.in);
        int pick = mainScanner.nextInt();
        if (pick==1){
            dumEmail();

        }else if (pick==2){
            dumNumber();
        }else{
            System.out.println("==================================");
            System.out.println("Mohon masukkan pilihan yang benar");
            System.out.println("==================================");
            mainMenu();
        }
    }

    public static void dumEmail(){
        String [] arrName={"irvan","repaldo","winda","bella","oppa"};
        String [] arrVend= {"@gmail","@yahoo","@hotmail"};
        String [] arrDomain = {".com",".co.id",".co.edu",".org"};
        StringBuilder Email = new StringBuilder();
        for (int i=0;i<10;i++){

            int randPrefix = random.nextInt(1,4);
            int randNum = random.nextInt(1,100);
            int randFirst = random.nextInt(0,5);
            int randSec = random.nextInt(0,5);
            int randVen = random.nextInt(0,3);
            int randDom = random.nextInt(0,4);
            String firstName = arrName[randFirst] ;
            String lastName = arrName[randSec];
            String vendor = arrVend[randVen];
            String domain = arrDomain[randDom];
            System.out.print((i+1)+". ");
            if (randPrefix==1){

                Email.append(randNum).append(firstName).append(lastName).append(vendor).append(domain);


            } else if (randPrefix==2) {

               Email.append(firstName).append(randNum).append(lastName).append(vendor).append(domain);

            }else if (randPrefix==3){

                Email.append(firstName).append(lastName).append(randNum).append(vendor).append(domain);

            }
            System.out.println(Email);
            Email.delete(0,Email.length());

        }
        System.out.println("===========================\n");
        mainMenu();




       /* if (randPrefix==1){

            System.out.println(randNum+firstName+lastName+vendor+domain);


        } else if (randPrefix==2) {

            System.out.println(firstName+randNum+lastName+vendor+domain);

        }else if (randPrefix==3){

            System.out.println(firstName+lastName+randNum+vendor+domain);

        }*/
    }

    public static void dumNumber(){

        mainMenu();

    }

}