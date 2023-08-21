package com.bcafinance.Ujian;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class UjianJF11 {

    /*
    Contoh Soal Ujian

    Buatlah sistem pengisian data contoh email yang dinamis dan sistem pengisian contoh nomor telepon dinamis acak
    */

    static Random random = new Random();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){

        System.out.println("Jumlah data format no handphone yang ingin di generate : ");
        Scanner mainScanner = new Scanner(System.in);
        int pick = mainScanner.nextInt();
        dumNum(pick);
    }

    public static void dumNum(int pick){

        StringBuilder no = new StringBuilder();
        int []  arrvend= {12,13,57,56,52} ;

        for (int i=0;i<pick;i++){

            int randPrefix =  random.nextInt(1,3);
//            int randPrefix =  1;
            String firstNum = "";
            String noHP="";
            String noHP2="";
            String vend = "";
            System.out.print((i+1)+". ");
            if (randPrefix==1){
                firstNum+="08";
                int randVend = random.nextInt(0,5);
                vend+=arrvend[randVend];
                noHP+=no.append(firstNum).append(vend).append("-").append(no2()).append("-").append(no3());
                no.delete(0,noHP.length());

            } else if (randPrefix==2) {
                firstNum+="628";
                int randVend = random.nextInt(0,5);
                vend+=arrvend[randVend];
                noHP+=no.append(firstNum).append(vend).append("-").append(no2()).append("-").append(no3());
                no.delete(0,noHP.length());
            }
            System.out.println(noHP);

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

    public static String no2(){
        StringBuilder no = new StringBuilder();
           int intRand= random.nextInt(100,1000);
           String digit2 ="";
           digit2+= no.append(intRand);
           return digit2;

    }
    public  static String no3(){
        StringBuilder no = new StringBuilder();
        String digit3 ="";
        int randDigit = random.nextInt(0,5);
        int [] digit ={1000,10000,100000,10000000,10000000};
        int rand= digit[randDigit];
        int intRand= random.nextInt(100,rand);
        digit3+= no.append(intRand);
        return digit3;

    }
}