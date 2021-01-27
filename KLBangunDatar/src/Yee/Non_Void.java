package Yee;

import java.util.Scanner;

public class Non_Void {

    // Menginisialisai Variabel Instance agar lebih fleksibel untuk pemakaian
    // Membuat scanner

    Scanner S = new Scanner(System.in);
    double s, p, l;
    double hasil;
    boolean b1 = true;

    double persegi(){

        // Proses memasukkan variabel s untuk persegi
        // memasukkan operator penghitungan persegi
        // menggunakan while agar bisa merubah nilai variabel bila salah

        while (b1){
            System.out.print("Masukkan sisi persegi : " + "\n" + "(Dalam Bentuk CM)" + "\n" + ": ");
            s = S.nextDouble();
            S.nextLine();
            System.out.print("Apakah sisi sudah benar ? : Ya / Tidak" + "\n" + ": ");
            String z = S.next();
            if(z.equals("Ya")){
                b1 = false;
            }else if(z.equals("Tidak")){
                b1 = true;
            }
        }
        hasil = s * 4;
        return hasil;
    }
    double perpanjang(){

        // Proses memasukkan variabel p dan l untuk persegi
        // memasukkan operator penghitungan persegi panjang
        // menggunakan while agar bisa merubah nilai variabel bila salah

        while (b1){
            System.out.print("Masukkan Panjang Persegi Panjang : " + "\n" + "(Dalam Bentuk CM)" + "\n" + ": ");
            p = S.nextDouble();
            S.nextLine();
            System.out.print("Masukkan Lebar Persegi Panjang : " + "\n" + "(Dalam Bentuk CM)" + "\n" + ": ");
            l = S.nextDouble();
            S.nextLine();
            System.out.print("Apakah semua sudah benar ? : Ya / Tidak" + "\n" + ": ");
            String z = S.next();
            if(z.equals("Ya")){
                b1 = false;
            }else if(z.equals("Tidak")){
                b1 = true;
            }
        }
        hasil = (p * 2) + (l * 2);
        return hasil;
    }

}
