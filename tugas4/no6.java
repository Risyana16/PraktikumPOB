package tugas4;

import java.util.Scanner;

public class no6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah Punya Member ? (Y/T) : ");
        char pm = input.nextLine().charAt(0);

        System.out.print("Masukan Total Belanjaan : ");
        int tb = input.nextInt();

        double diskon = 0;
        if (pm == 'y' || pm == 'Y') {
            if (tb > 500_000) {
                diskon = 50_000;
            } else if (tb > 100_000) {
                diskon = 15_000;
            }
        } else {
            if (tb > 100_000) {
                diskon = 10_000;
            }

        }

        double totalbayar = tb - diskon;
        System.out.println("PEMBAYARAN");
        System.out.println("Total Belanja : " + tb);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total Pembayaran : " + totalbayar);

        double uang = 0;
        do {
            System.out.print("Masukkan Uang : ");
            uang = input.nextDouble();
            if (uang < totalbayar) {
                System.out.println("UANG KURANG");
            }

        } while (uang < totalbayar);

        if (uang > totalbayar) {
            double kembalian = uang - totalbayar;
            System.out.println("Kembalian : " + kembalian);
        } else if (uang == totalbayar) {
            System.out.println("TIDAK ADA KEMBALIAN");
        }

    }
}
