package tugas4;

import java.util.Scanner;


public class no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1.LUAS PERSEGI");
        System.out.println("2.LUAS SEGITIGA");
        System.out.println("3.LUAS LINGKARAN");
        System.out.println("4.LUAS TRAPESIUM");
        System.out.println("5.LUAS LAYANG-LAYANG");
        System.out.print("Masukan pilihan : ");
        int pilihan = input.nextInt();
        
        double luas = 0;
        
        switch (pilihan){
            case 1:
                System.out.print("Masukan Sisi Persegi : "); 
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi : "+luas);
                break;
            case 2:
                System.out.print("Masukan Alas : ");
                double alas = input.nextDouble();
                System.out.print("Masukan Tinggi : ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga : "+luas);
                break;
            case 3:
                System.out.print("Masukan jari jari : ");
                double r = input.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran : "+luas);
            case 4:
                System.out.print("Masukan sisi sejajar a : ");
                double a = input.nextDouble();
                System.out.print("Masukan sisi sejajar b : ");
                double b = input.nextDouble();
                System.out.print("Masukan Tinggi : ");
                double t = input.nextDouble();
                luas = 0.5 * (a+b)*t;
                System.out.println("Luas Trapesium : "+luas);
                break;
            case 5:
                System.out.print("Masukan d1 : ");
                double d1 = input.nextDouble();
                System.out.print("Masukan d2 : ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 *d2;
                System.out.println("Luas Layang - Layang : " + luas);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
