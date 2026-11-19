
package tugas6;

public class No2mengubahArry {
    public static void main(String[] args) {
        
       String [] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
       System.out.println("MENAMPILKAN INDEKS SEBELUM DI GANTI"); 
       for(int i = 0; i < mobil.length; i++){
           System.out.println("Indeks " +i +" : " +mobil[i]);
       }   
       
        System.out.println("MENAMPILKAN INDEKS YANG SUDAH DI GANTI");
           mobil[1]= "toyota";
         for(int i = 0; i < mobil.length; i++){
           System.out.println("Indeks" +i +" : " +mobil[i]);
           
         }
       
        }
    }

