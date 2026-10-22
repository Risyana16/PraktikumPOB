package tugas3;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("waktu pertama");
        System.out.print("Masukan jam : ");
        int jam1 = input.nextInt();
        System.out.print("Masukan menit : ");
        int menit1 = input.nextInt();
        System.out.print("Masukan detik : ");
        int detik1 = input.nextInt();
        
        System.out.println("waktu kedua");
        System.out.print("Masukan jam : ");
        int jam2 = input.nextInt();
        System.out.print("Masukan menit : ");
        int menit2 = input.nextInt();
        System.out.print("Masukan detik : ");
        int detik2 = input.nextInt();
        
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int jamHasil = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menitHasil = sisaDetik / 60;
        int detikHasil = sisaDetik % 60;
        
        System.out.println("Selisih: " + jamHasil + " jam, " + menitHasil + " menit, " + detikHasil + " detik.");
        System.out.println("Total Selisih Detik: " + selisihDetik + " detik");
    }
}

//
