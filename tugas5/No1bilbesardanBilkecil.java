package tugas5;

import java.util.Scanner;


public class No1bilbesardanBilkecil {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
      
        int angka;
        int terkecil = 0;
        int terbesar = 0 ;
        int n;
        System.out.print("Masukan Jumlah angka : ");
        n = input.nextInt();
        
        for(int i =1; i<=n;i++){
            System.out.print("Bilangan "+i+" :");
            angka = input.nextInt();
            if(i==1){
                terbesar = angka;
                terkecil = angka;
            }else  if(angka > terbesar){
                    terbesar = angka;
            }else if (angka < terkecil){
                terkecil = angka;  
            }  
         
        }
        System.out.println("================================");
        System.out.println("Bilangan Terbesar Adalah : "+terbesar);
        System.out.println("Bilangan Terkecil Adalah : "+terkecil);
    }
            
}
