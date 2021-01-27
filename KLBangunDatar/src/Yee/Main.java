package Yee;

public class Main {

    public static void main(String[] args) {

        // Pembuatan objek baru untuk Class Non_Void dan Class Void

        Non_Void nv = new Non_Void();
        Void v = new Void();

        // Menjalankan Method dari tiap Class

        v.pilih();

        if(v.si == 1){
            System.out.println("Keliling Persegi = " + (float)nv.persegi());
        }else if(v.si == 2){
            System.out.println("Keliling Persegi Panjang = " + (float)nv.perpanjang());
        }
    }
}
