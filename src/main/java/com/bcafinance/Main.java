package com.bcafinance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        int a, b, c; // declaration variable
        int num = 3; // declaration variable with initiation value
        int num2 = 2;
        int num3 = 2 * 3; // expression (2*3)
         System.out.println("Hello world!");

         if(num!=2){ //IF Condition
         System.out.println("False");
         }else {
         System.out.println("True");
         }

         for (int i = 1;i<=10;i++) { //Perulangan For
         System.out.println("ini adalah perulangan ke " + i);
         }

         int sum = num>>num2; //Operator
         System.out.println(sum);

         int dataSecond = 22;
         float longData = dataSecond;//
         System.out.println(dataSecond);
         System.out.println(longData);

         float f = 3.324243532f;
         double d = 3.23442323445242;
         System.out.println("Default value f = "+f);
         System.out.println("Default value d = "+d);

         d = f;

         System.out.println("Default value f (long) = "+f);
         System.out.println("Default value d (float) = "+d);


         d= Double.parseDouble(Float.toString((f))); // ketika ingin mengubah tipe
//         data dari float ke double sebaiknya ubah float ke string baru di ubah lagi ke
//         double.

         System.out.println(d);
         System.out.println(f);

         System.out.println(true^false); //XOR
         System.out.println(true^true); //XOR
         System.out.println(false^false); //XOR

         System.out.println(!(true^false)); //XNOR (kebalikan XOR)

         System.out.println(Integer.toBinaryString(4)); // get int to binary
         System.out.println();
//         hierarky tipe data ialah String paling tinggi kemudian di ikuti dengan yang      lain.
//
//         StringBuilder strBuild = new StringBuilder(); // penggunaan Stringbuilder
//         String strTest =
//         strBuild.append("aku").append("adalah").append("lelaki").toString();
//         System.out.println(strTest);
//
//         double hasil = 75/8; //hasilnya akan menjadi 9.0 dikarenakan yang di bagi         masih bertipe data INT
//         double hasil2 = 75/8.0; //hasilnya akan menjadi 9.375 dikarenakan ada double yang di bagi
//         System.out.println(hasil);
//
//         String strX = "";
//         int intX = 0;
//
//         System.out.print("Masukkan Kata : ");
//         Scanner scanner = new Scanner(System.in);
//         strX = scanner.nextLine();
//         System.out.println("Anda Memasukkan Kata "+strX);
//
//         System.out.print("Masukkan Angka : ");
//         intX = scanner.nextInt();
//         System.out.println("Anda Memasukkan Angka "+intX);

        boolean isValid = true;
        String strX = "Yes";
        int intZ = 80;

        if (isValid) {
            System.out.println("State 1");
        } else if (strX.equals("Yes")) {
            System.out.println("State 2");
        } else {
            System.out.println("State 3");
        }

        String hasil= ("asd"=="asd")?"True":"False";
        System.out.println(hasil);

        System.out.println("BuaH".compareTo("Suah"));
        Palindrom palindrom = new Palindrom();
        palindrom.palTest();
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//
//        Main main = new Main();
//        main.run();
//
//    }
//
//    public void run(){
//        DB db = new DB();
//        db.dbConnect("jdbc:sqlserver://Vanndice\\SQLEXPRESS01:51926;databaseName=dbsa;;encrypt=true;trustServerCertificate=true;","sa","sa");
//
//    }
//
//    class DB
//    {
//        public DB() {}
//        Connection conn = null;
//
//        public void dbConnect(String db_connect_string, String db_userid, String db_password)
//        {
//            try
//            {
//                Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
//                System.out.println("connected");
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//        }
//
//        public void insertDataMahasiswa(String nama, String nim, String dob) {
//
//            String sql = "INSERT INTO dbo.mahasiswas (nama, nim, dob) VALUES (?,?,?)";
//
//            try {
//                PreparedStatement statement =  conn.prepareStatement(sql);
//                statement.setString(1, nama);
//                statement.setString(2, nim);
//                statement.setString(3, dob);
//
//                int rowInsert = statement.executeUpdate();
//                if (rowInsert > 0) {
//                    System.out.println("Data berhasil disimpan");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        public void updateDataMahasiswa(String nama, String nim, String dob, int id) {
//
//        String sql = "UPDATE dbo.mahasiswas SET nama = ?, nim = ?, dob = ? WHERE id = ?";
//
//        try {
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, nama);
//            statement.setString(2, nim);
//            statement.setString(3, dob);
//            statement.setInt(4, id);
//
//            int rowInsert = statement.executeUpdate();
//            if (rowInsert > 0) {
//                System.out.println("Data berhasil disimpan");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//        public void selectDataMahasiswa(){
//            String sql = "SELECT * FROM dbo.mahasiswas";
//
//            try {
//                PreparedStatement statement = conn.prepareStatement(sql);
//                ResultSet result = statement.executeQuery();
//
//                while(result.next()){
//                    System.out.println("ID : " + result.getInt("id"));
//                    System.out.println("Nama : " + result.getString("nama"));
//                    System.out.println("NIM : " + result.getString("nim"));
//                    System.out.println("Tanggal Lahir : " + result.getString("dob"));
//                    System.out.println("=====================================");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        public void deleteDataMahasiswa(int id){
//            String sql = "DELETE FROM dbo.mahasiswas WHERE id = ?";
//
//            try {
//                PreparedStatement statement = conn.prepareStatement(sql);
//                statement.setInt(1, id);
//
//                int rowInsert = statement.executeUpdate();
//                if (rowInsert > 0) {
//                    System.out.println("Data berhasil dihapus");
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}