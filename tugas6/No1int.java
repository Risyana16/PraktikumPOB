/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;
import java.util.ArrayList;
/**
 *
 * @author Asus Tuf Gaming
 */
public class No1int {
    public static void main(String[] args) {
        
        System.out.println("ARRAY 1 DIMENSI");
        
        int[]x = {3,4,5};
        
        for(int i = 0; i<x.length;i++ ){
            System.out.println("indeks "+i+ " : "+ x[i]);
        }
      
        System.out.println("ARRAY MULTIDIMENSI");
        int [][]n = {
            {2,3,4},
            {2,3,5}
                
        };
        for(int g = 0; g<n.length;g++){
            for(int h =0; h<n.length;h++){
                System.out.print(n[g][h]+" ");
            }
            System.out.println(" ");
        }
        
         System.out.println("ARRAY LIST");
        ArrayList<Integer> angka =new ArrayList<Integer>();
        angka.add(10);
        angka.add(20);
        angka.add(30);
        
        //menampilkan indeks
        System.out.println(angka.get(0));
        //edit
        angka.set(0,40);
        //hapus
        angka.remove(1);
        //mendapatkan data array
        System.out.println(angka.size());
        // hapus semua data
        angka.clear();
    }
}
