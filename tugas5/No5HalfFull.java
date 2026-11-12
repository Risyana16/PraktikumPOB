/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author Asus Tuf Gaming
 */
public class No5HalfFull {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("--- Half Triangle ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n--- Full Triangle ---");
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
