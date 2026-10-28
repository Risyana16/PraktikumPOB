package tugas4;

import java.util.Scanner;


public class no2 {
    static void menu(){
        System.out.println("Menu");
        System.out.println("1.Senin");
        System.out.println("2.Selasa");
        System.out.println("3.Rabu");
        System.out.println("4.Kamis");
        System.out.println("5.Jumaat");
        System.out.println("6.Sabtu");
        System.out.println("7.Minggu");
        
    }
    
    static void conversi(){
        menu();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan pilihan : ");
        int menu = input.nextInt();
        menuhari(menu);
    }
    static void menuhari(int menu){
        switch(menu){
            case 1:
                System.out.println("Seni");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("jumaat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("tidak valid");
        }   
    }
    public static void main(String[] args) {
       conversi();
    }
}
