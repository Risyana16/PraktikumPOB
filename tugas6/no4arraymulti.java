package tugas6;

import java.util.Scanner;

public class no4arraymulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine(); // Membersihkan sisa enter setelah input jumlah

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai  : ");
            nilai[i] = input.nextInt();
            input.nextLine(); 

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }
            System.out.println("");
        
            System.out.println("Daftar Mahasiswa:");
            for(int i = 0; i < jumlah; i++){
            System.out.println("Mahasiswa ke-" + (i+1) + ":");
            System.out.println("Nama: " + nama[i]);
            System.out.println("Nilai: " + nilai[i]);
            System.out.println("Status: " + status[i]);
            System.out.println("");
    }
}
}