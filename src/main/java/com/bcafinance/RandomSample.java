package com.bcafinance;

import java.util.Random;

public class RandomSample {
    public static void main(String[] args) {
        Random random = new Random();
        int intRandom = random.nextInt(97,122);
        char chRandom = (char) intRandom;
        /*
            uig11op@gmail.com
            joyu99@rocketmail.edu
            32hari@ymail.co.id
         */

        int intPrefix = 0;
        Character [] chVokal = {'a','i','u','e','o'};
        Character chKonsonan = 'a';
        int intRandomVokal = 0;
        String strAppend = "";
        int intSetelahnya = 0;

//        if(1)-> vokal
//        if(2)-> konsonan
        StringBuilder sBuild = new StringBuilder();
        for(int i=0 ;i<10;i++)
        {
            intPrefix = random.nextInt(1,3);
            intSetelahnya = random.nextInt(6,9);
            strAppend ="";
            if(intPrefix==1)
            {
                intRandomVokal = random.nextInt(1,5);
                strAppend += chVokal[intRandomVokal].toString().toUpperCase()+getConsonan().toString();
                intRandomVokal = random.nextInt(1,5);
                strAppend += chVokal[intRandomVokal].toString()+getConsonan().toString();
            }else {
                intRandomVokal = random.nextInt(1,5);
                strAppend += getConsonan().toString().toUpperCase()+chVokal[intRandomVokal].toString();
                intRandomVokal = random.nextInt(1,5);
                strAppend += getConsonan().toString()+chVokal[intRandomVokal].toString();
            }

            for(int j=0;j<intSetelahnya;j++){
                intRandom = random.nextInt(97,122);
                chRandom = (char) intRandom;
                strAppend += chRandom;
            }
            System.out.println(strAppend);
            //Ekor ->
            //Yiku ->
            /*
                case 1 - > vokal lalu consonan lalu vokal
                lalu consonan -> bebas max 10 digit
                case 2 ->  consonan lalu vokal lalu consonan
                lalu vokal -> bebas min 10 max 12 digit
             */
        }
    }

    private static Character getConsonan(){
        boolean isValid = true;
        Random r = new Random();
        int intR = r.nextInt(97,122);
        Character chR = 'x';
        while(isValid)
        {
            intR = r.nextInt(97,122);
            chR = (char) intR;
            if(!(chR=='a'||
                    chR=='i'||
                    chR=='u'||
                    chR=='e'||
                    chR=='o')
            ){
                isValid=false;
            }
        }

        return chR;
    }

//    public String patternOne()//1
//    {
//        String strOne = "oji";
//        Random r = new Random();
//        int intR = r.nextInt(1,1000);
//        String strTwo = "ijo";
////        "oji78ijo@yahoo.co.id"
//    }
}
