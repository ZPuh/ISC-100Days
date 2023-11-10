package identitasloop;
import java.util.Scanner;
public class IdentitasLoop {
    public static void main(String[] args) {
        String nama,alamat,nim,loop;        
        do {
            Scanner sc = new Scanner (System.in);
            System.out.println("---DATA MAHASISWA---");
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Kelas      : ");
            alamat = sc.nextLine();
            System.out.print("Nim        : ");
            nim = sc.nextLine();
            System.out.println("--------------------");            
            System.out.print("Lanjut (y/n) : ");
            loop = sc.next();
        } while (loop.equalsIgnoreCase("y"));
        System.out.println("Program Selesai");

    }
    
}
