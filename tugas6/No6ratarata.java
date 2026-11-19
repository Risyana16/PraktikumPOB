/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Asus Tuf Gaming
 */
public class No6ratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        
              
        while (true) {
            try {
                System.out.print("Masukkan jumlah bilangan yang akan dirata-rata: ");
                n = input.nextInt();
                if (n <= 0) {
                    System.out.println("Jumlah bilangan harus lebih dari 0.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: Harap masukkan angka bulat yang valid!");
                input.next(); 
            }
        }

        double[] bilangan = new double[n];
        double total = 0;
        int i = 0;

       
        while (i < n) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                bilangan[i] = input.nextDouble();
                total += bilangan[i];
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: Input bukan bilangan! Silakan masukkan ulang angka.");
                input.next(); 
            }
        }

        double rataRata = total / n;
        System.out.println("\nTotal keseluruhan: " + total);
        System.out.println("Nilai rata-rata dari bilangan tersebut adalah: " + rataRata);

        input.close();
    }
}
