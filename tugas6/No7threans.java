/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Asus Tuf Gaming
 */
public class No7threans{
    public static void main(String[] args) {
        ThreadBaru objekThread = new ThreadBaru();
        objekThread.start(); // Memulai eksekusi thread baru
    }
}
   class ThreadBaru extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread baru berjalan - langkah ke-" + i);
        }
    }
}


