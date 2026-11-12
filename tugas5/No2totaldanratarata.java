package tugas5;

import java.util.Scanner;


public class No2totaldanratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        double total = 0;
        double rata_rata =0;
        int j;
        System.out.print("Masukan Bilangan : ");
        j = input.nextInt();
        
        for(int i =1; i<=j;i++) {  
            System.out.print("Masukan angka "+i+" :");
            angka =input.nextInt();
            total += angka;
           
    }
        rata_rata = total/j;
        System.out.println("====================================");
        System.out.println("Total Bilangan : "+total);
        System.out.println("Rata - Rata Bilangan : "+rata_rata);
}
}