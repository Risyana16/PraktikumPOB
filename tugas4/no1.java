package tugas4;

import java.util.Scanner;


public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int angka = input.nextInt();
        
        if(angka %2==0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
            }
    }
     
     
}
