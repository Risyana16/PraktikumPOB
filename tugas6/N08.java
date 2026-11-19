/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Asus Tuf Gaming
 */
public class N08 {
     public static void main(String[] args) {
        int jumlah = 5; 

        for (int i = 1; i <= jumlah; i++) {
            ThreadAnak t = new ThreadAnak("Thread-" + i);
            t.start();
        }
    }

}
    class ThreadAnak extends Thread {
    private String namaThread;

    public ThreadAnak(String namaThread) {
        this.namaThread = namaThread;
    }

    @Override
    public void run() {
        System.out.println("Menjalankan: " + namaThread);
    }
}


