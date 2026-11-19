/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Asus Tuf Gaming
 */
public class No9duaarray {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};


        System.out.println("=== Cara 1: For Biasa ===");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + age[i]);
        }

        
        System.out.println("\n=== Cara 2: For-Each ===");
        for (int nilai : age) {
            System.out.println("Nilai : " + nilai);
        }
    }
}
