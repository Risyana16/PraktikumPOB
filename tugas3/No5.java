
package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.print("Masukan jumlah mangga : ");
        int mangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan jumlah mangga yang busuk : ");
        int manggabsk = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan jumlah jambu: ");
        int jambu = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan jumlah tetangga  : ");
        int tetangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan jumlah jambu per tetangga: ");
        int jambuttg = Integer.parseInt(br.readLine());
        
        int sisamangga = mangga - manggabsk;
        int totaljambu = tetangga * jambuttg;
        int total = sisamangga + totaljambu;
        
        System.out.println("hasil perhitungan");
        System.out.println("Sisa Mangga Bagus : " + sisamangga + " pcs");
        System.out.println("Total Buah Jambu  : " + totaljambu + " pcs");
        System.out.println("Total Seluruh Buah: " + total + " pcs");
    }
}
