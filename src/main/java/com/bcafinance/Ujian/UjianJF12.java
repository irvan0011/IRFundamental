package com.bcafinance.Ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianJF12 {


    /*
    Contoh Soal Ujian

    Buatlah sistem pengisian data contoh email yang dinamis dan sistem pengisian contoh nomor telepon dinamis acak
    */

    static Random random = new Random();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){

        System.out.println("Jumlah data format email yang ingin di generate : ");
        Scanner mainScanner = new Scanner(System.in);
        int pick = mainScanner.nextInt();
        dumEmail(pick);
    }

    public static void dumEmail(int pick){
        String [] arrVend= {"@gmail","@yahoo","@hotmail"};
        String [] arrDomain = {".com",".co.id",".co.edu",".org"};
        StringBuilder Email = new StringBuilder();
        for (int i=0;i<pick;i++){

//            int randPrefix = random.nextInt(1,3);
            int randPrefix =  random.nextInt(1,4);
            int randNum = random.nextInt(1,100);
            int randVen = random.nextInt(0,3);
            int randDom = random.nextInt(0,4);
            String strChr1 = "";
            String strChr2 = "";
            String vendor = arrVend[randVen];
            String domain = arrDomain[randDom];
            System.out.print((i+1)+". ");
            if (randPrefix==1){
                int randFor = random.nextInt(9,12);
                for (int j =0;j<randFor;j++){
                    int intRandom = random.nextInt(97,122);
                    char chRandom = (char) intRandom;
                    strChr1+=chRandom;
                }
                Email.append(randNum).append(strChr1).append(vendor).append(domain);


            } else if (randPrefix==2) {
                int randFor = random.nextInt(9,12);
                for (int j =0;j<randFor;j++){
                    int intRandom = random.nextInt(97,122);
                    char chRandom = (char) intRandom;
                    if (j%2==0){

                        strChr1+=chRandom;
                    }else {
                        strChr2+=chRandom;
                    }
                }
                Email.append(strChr1).append(randNum).append(strChr2).append(vendor).append(domain);

            }else if (randPrefix==3){
                int randFor = random.nextInt(9,12);
                for (int j =0;j<randFor;j++){
                    int intRandom = random.nextInt(97,122);
                    char chRandom = (char) intRandom;
                    strChr1+=chRandom;
                }
                Email.append(strChr1).append(randNum).append(vendor).append(domain);


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
}
