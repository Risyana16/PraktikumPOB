/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author Asus Tuf Gaming
 */
public class No4ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total =0;
        int ganjil;
        int n;
        System.out.print("Masukan Banyak Bilangan : ");
        n = input.nextInt();
        
        for(int i =1; i<=n; i++){
            ganjil = 2*i-1;
            System.out.print(ganjil+" ");
            total += ganjil;
        }
        System.out.println("");
          System.out.println("Total penjulahan : "+total);      
    }
}
