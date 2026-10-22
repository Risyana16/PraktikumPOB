package tugas3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nomor Pegawai : ");
        long nomor = input.nextLong();
        input.nextLine();
        
        System.out.print("Masukan Nama pegawai : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Almat : ");
        String alamat = input.nextLine();
        
        String jabatan = "Manager";
        double gp = 2_000_000;
        double tj = 300_000;
        double ts = 200_000;
        double ta = 150_000;
        
        double tg = gp + tj + ts + ta ;
        double pp = 0.10 * (gp + tj + ta);
        double gb = tg - pp;
        
        //no1
        System.out.println("======== Gaji Karyawan ==========");
        System.out.println("Nomor Induk Karyawan : " + nomor) ;
        System.out.println("Nama Karyawan : " + nama) ;
        System.out.println("Alamat : " + alamat) ;
        System.out.println("Jabatan  : " + jabatan) ;
        System.out.println("Gaji Pokok : "+gp);
        System.out.println("Tunjangan Jabatan : " + tj) ;
        System.out.println("Tunjangan Istri : " + ts) ;
        System.out.println("Tunjangan Anak : " + ta) ;
        System.out.println("Total Gaji : " + tg);
        System.out.println("Pajak Penghasilan : " + pp);
        System.out.println("Gaji Bersih : " + gb);
        
     
       
    }
}
