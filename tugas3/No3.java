package tugas3;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.print("Masukan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Umur : ");
        int umur = input.nextInt();
       
        System.out.print("Masukan Tinggi Badan : ");
        int tb = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan Berat Badan : ");
        int bb = Integer.parseInt(br.readLine());
        
        
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Tinggi Badan : "+tb);
        System.out.println("Berat Badan : "+bb);
        
    }
}

// Perbedaan Scanner dan Bufferedreader
//1.Scanner tidak ribet kalau Bufferedreader sedikit ribet
//2.Bufferedreader metod nya harus manual 
//  kalau scanner otomatis
