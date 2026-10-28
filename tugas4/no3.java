package tugas4;

import java.util.Scanner;

class karyawan{
    String nik;
    String nama;
    String status;
    int kodegolongan;
    int jumlahanak;
    int gaji = 0;
    
   
    void profil(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan NIK : ");
         nik = input.nextLine();
        
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        
        System.out.print("Masukan Status : ");
        status = input.nextLine();
        
        pengecekan(status);
        
        System.out.print("Masukan Jumlah anak : ");
        jumlahanak = input.nextInt();
        
      
       
        
    }
    
    
    
    void pengecekan(String status){
    if(status.equals("menikah")){
        kodegolongan = 1;
        gaji += 1200000;
        
    }else if (status.equals ("belum menikah")){
        kodegolongan = 2;
        gaji += 1500000;
        
    }else if (status.equals("cerai")){
        kodegolongan = 3;
        gaji += 1750000;
        
    }else if (status.equals("menikah dan punya anak")){
        kodegolongan = 4;
        gaji += 2000000;
        
    }else{
        System.out.println("golongan tidak ada");
    }
}
        void tampil(){
        System.out.println("==============================");
        System.out.println("NIK : "+nik);
        System.out.println("Nama : "+nama);
        System.out.println("Status : "+status);
        System.out.println("Jumlah anak : "+jumlahanak);
        System.out.println("Gaji Pokok : "+ gaji);
        System.out.println("golongan : "+kodegolongan);
        System.out.println("=============================");
        hitung(kodegolongan,gaji,jumlahanak);
    }

void hitung (int kodegolongan,int gaji, int jumlahanak){
    switch (kodegolongan){
        case 1:
            double tunjangan = gaji *10/100;
            System.out.println("tunjangan menikah " +tunjangan);
            break;
        case 4:
            double tunjangananak = gaji * 5/100 * jumlahanak ;
            double tunjanganistri = gaji *10/100;
            double totaltunjangan = tunjangananak + tunjanganistri ;
            System.out.println("tunjangan anak "+ tunjangananak);
            System.out.println("tunjangan anak "+ tunjanganistri);
            System.out.println("total tunjangan : " + totaltunjangan);
            break;
        default :
            System.out.println("tidak ada ");
            
        }
    }
}

public class no3 {
    public static void main(String[] args) {
        karyawan Karyawan    = new karyawan();
        Karyawan.profil();
        Karyawan.tampil();
    }
}
