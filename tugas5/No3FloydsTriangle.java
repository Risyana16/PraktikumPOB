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
public class No3FloydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka =0;
        int z;
        System.out.print("Masukan Banyak Baris : ");
        z =input.nextInt();
        
        for(int i = 1; i <= z; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
            
        }
                
    }
}
