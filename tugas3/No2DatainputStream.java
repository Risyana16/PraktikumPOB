
package tugas3;
import java.io.*;

public class No2DatainputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("mahasiswa.dat")
        );
        
        output.writeUTF("Risyana");
        output.writeDouble(15000.0);
        output.writeDouble(10.0);
        output.writeDouble(0.0);
        output.writeDouble(20000.0);
        output.writeDouble(0.0);
        output.close();
        
        DataInputStream input =new DataInputStream(
                new FileInputStream("mahasiswa.dat")
        );
        
        String nama = input.readUTF();
        double tb =input.readDouble();
        double diskon = input.readDouble();
        double d = tb*(diskon/100);
        double total  = input.readDouble()+ tb-d ;
        double bayar =input.readDouble();
        double kembalian = input.readDouble() + bayar - total;
        
        
        
        
        
        System.out.println("Nama : " + nama);
        System.out.println("Total Belanja : " + tb);
        System.out.println("Diskon (%) : " + diskon);
        System.out.println("Total : " + total );
        System.out.println("Bayar : " + bayar);
        System.out.println("Kembalian : " + kembalian);
        
    }
            
}
