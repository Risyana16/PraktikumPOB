package tugas6;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus Tuf Gaming
 */
public class No3Arrysatudimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("BAGIAN A");
        System.out.print("Masukan jumlah Array : ");
        int i = input.nextInt();
        int [] array = new int[i];
        
        System.out.println("BAGIAN B");
        System.out.println("Masukkan " + i + " nilai elemen:");
        for (int j = 0; j < i; j++) {
            System.out.print("Elemen ke-" + j + ": ");
            array[j] = input.nextInt();
        }
        System.out.println("BAGIAN C"); 
        int terbesar = array[0];
        int terkecil = array[0];
        int max = 0; 
        int min = 0; 
      
        for (int j = 1; j < i; j++) {
        if (array[j] > terbesar) {
            terbesar = array[j];
            max = j;
        } else if (array[j] < terkecil) {
            terkecil = array[j];
            min = j; 
        }
        }
        
        System.out.println("Terbesar : " + terbesar + " indeks " + max);
        System.out.println("Terkecil : " + terkecil + " indeks " + min);
        System.out.println(" ");
        
        System.out.println("BAGIAN D");
        double jumlah = 0;
        for(int k=0; k<i;k++){
            jumlah +=array[k];
        }
        double rataRata = jumlah/i;
        System.out.println("Jumlah total data: " + jumlah);
        System.out.println("Nilai rata-rata: " + rataRata);
        
        System.out.println("BAGIAN F");
         System.out.println("BAGIAN G");
        int jumlahgenap = 0;
        
        for (int j = 0; j < i; j += 2) {
            jumlahgenap += array[j];
        }
             System.out.println("Jumlah elemen berindeks genap: " + jumlahgenap); 
        if (jumlahgenap % 2 == 0) {
             System.out.println("Hasil penjumlahan " + jumlahgenap + " bernilai GENAP.");
        } else {
            System.out.println("Hasil penjumlahan " + jumlahgenap + " bernilai GANJIL.");
        }
        System.out.println(" ");
        System.out.println("BAGIAN H");
        int[] ascArray = new int[i];
        int[] descArray = new int[i];


        for (int a = 0; a < i; a++) {
            ascArray[a] = array[a];
            descArray[a] = array[a];
        }

        for (int a = 0; a < i - 1; a++) {
            for (int b = 0; b < i - 1 - a; b++) {
                if (ascArray[b] > ascArray[b + 1]) {
                    int temp = ascArray[b];
                    ascArray[b] = ascArray[b + 1];
                    ascArray[b + 1] = temp;
                }
            }
        }
        
        for (int a = 0; a < i - 1; a++) {
            for (int b = 0; b < i - 1 - a; b++) {
                if (descArray[b] < descArray[b + 1]) { 
                    int temp = descArray[b];
                    descArray[b] = descArray[b + 1];
                    descArray[b + 1] = temp;
                }
            }
        }

        System.out.print("Ascending (Terkecil ke Terbesar) : ");
        for (int j = 0; j < i; j++) {
            System.out.print(ascArray[j] + " ");
        }

        System.out.print("\nDescending (Terbesar ke Terkecil): ");
        for (int j = 0; j < i; j++) {
            System.out.print(descArray[j] + " ");
        }

}
}