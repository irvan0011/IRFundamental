package com.bcafinance.Collections;

public class Collection {
    public static void main(String[] args) {


        Siswa siswa = new Siswa();
        siswa.setAlamatSiswa("KB JERUK");
        siswa.setNamaSiswa("JERUK SANKIS");
        siswa.setIdSiswa("100001");

        int intArr [] = new int[4];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;

        Siswa[] stuArr = new Siswa[2];
        stuArr[0] = siswa;
//        Siswa = new Siswa();
        siswa.setAlamatSiswa("KB APEL");
        siswa.setNamaSiswa("APEL MALANG");
        siswa.setIdSiswa("100002");
        stuArr[1] = siswa;
        System.out.println(stuArr);


    }
}
