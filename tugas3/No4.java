package tugas3;

import java.util.Scanner;


public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Massa benda : ");
        double m = input.nextDouble();
        
        System.out.print("Masukan Kecepatan : ");
        double v = input.nextDouble();
        
        System.out.print("Masukan Jari - Jari : ");
        double r = input.nextDouble();
        
        double f = m*v*v/r;
        
        System.out.println("Gaya Sentripetalnya adalah : "+f+ " Newton");
        
    }
}
