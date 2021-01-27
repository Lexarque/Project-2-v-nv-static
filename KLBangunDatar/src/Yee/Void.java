package Yee;

import java.util.Scanner;

public class Void {

    // Menginisialisai Variabel Instance agar lebih fleksibel untuk pemakaian
    // Membuat scanner

    Scanner S = new Scanner(System.in);
    int si;

    void pilih(){

        // Memilih untuk meghitung persegi panjang atau persegi

            System.out.print("Persegi Panjang atau Persegi ? : " + "\n" + "1 untuk Persegi"
            + "\n" + "2 untuk Persegi Panjang" + "\n" + ": ");
            si = S.nextInt();
    }
}

