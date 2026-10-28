package tugas4;

import java.util.Scanner;

class kabisat{
    int tahun;
        

    void hitung(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan tahun : ");
        tahun = input.nextInt();
        
        if(tahun %4 == 0){
            System.out.println("adalah tahun kabisat");
        }else{
            System.out.println("bukan tahun kabisat");
        }
        
    }
}

    



public class no4 {
    public static void main(String[] args) {
        kabisat bisat = new kabisat();
        bisat.hitung();
    }
            
            
            
            
}
