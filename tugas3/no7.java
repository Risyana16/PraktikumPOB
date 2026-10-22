package tugas3;

import java.util.Scanner;


public class no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahnovel = input.nextInt();

        System.out.print("Masukkan tebal lembar per novel: ");
        int tebalpernovel = input.nextInt();
        
        int totallembar =  jumlahnovel * tebalpernovel;
        int totaldetik = totallembar;
        
        
        
        int menit = totaldetik / 60;
        totaldetik -= 60 * menit;
        
        int jam = menit/ 60;
        menit -= 60 * jam;
       
        int hari = jam/24;
        jam-= 24*hari;
       
        System.out.println("");
        System.out.println("Novel yang di cetak : " + jumlahnovel);
        System.out.println("Tebal novel : " + tebalpernovel);
        System.out.println("Total lembar : "+ totallembar);
        System.out.println("Waktu yang di butuhkan untuk mencetak novel : "+ hari+" hari "+ jam+" jam "+ totaldetik +" detik ");
    }
}
