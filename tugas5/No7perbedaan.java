/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus Tuf Gaming
 */
public class No7perbedaan {
    public static void main(String[] args) {
        System.out.println("--- Menggunakan i++ (Post-increment) ---");
        int a = 0;
        while (a < 5) {
            System.out.print((a++) + " "); 
        }

        System.out.println("\n\n--- Menggunakan ++i (Pre-increment) ---");
        int b = 0;
        while (b < 5) {
            System.out.print((++b) + " ");
        }
        System.out.println();
    }
}
