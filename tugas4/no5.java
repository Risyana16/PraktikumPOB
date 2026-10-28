package tugas4;

import java.util.Scanner;


public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan  total penjualan : ");
        double penjualan  = input.nextDouble();
        
        double jasa = 0;
        double komisi = 0;
        
        if(penjualan == 2000000){
            jasa = 100000;
            komisi = 0.10 * penjualan;
        }else if (penjualan > 5_000_000){
            jasa = 300000;
            komisi = 0.20 *penjualan;
            
        }else if (penjualan >= 2_000_000){
            jasa  = 200000;
            komisi = 0.15 * penjualan;
        }else{
            System.out.println("tidak dapat bonuss ");
        }
        
        double totalpendapatan = jasa +komisi;
        System.out.println("Total penjualan : "+penjualan);
        System.out.println("Uang jasa : "+jasa);
        System.out.println("Uang komisi : "+komisi);
        System.out.println("Pendaatan bonus :"+totalpendapatan);
    }
}
