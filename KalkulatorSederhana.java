package kalkulatorsederhana;
import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        // Membuat kalkulator/operator aritmatika menggunakan Switch
        Scanner sc = new Scanner (System.in);
        float bil1,bil2,hasil=0;
        String opsi;
        char opsi2;
        System.out.println("=================");
        System.out.println("KALKULATOR LITE");
        System.out.println("-----------------");
        System.out.println("Masukkan Angka :");
       // System.out.println("-----------------");
        System.out.print("Angka 1          = ");
        bil1 = sc.nextFloat();
        System.out.print("Operasi(+/-/x/:) = ");
        opsi = sc.next();
        opsi2 = opsi.charAt(0);
        System.out.print("Angka 2          = ");
        bil2 = sc.nextFloat(); 
        System.out.println("-----------------");
        switch (opsi2) {
            case '+':                
                hasil = bil1 + bil2;
                break;
            case '-':                
                hasil = bil1 - bil2;
                break;
            case ':':                
                hasil = bil1 / bil2;
                break;
            case 'x':                
                hasil = bil1 * bil2;
                break;
            default:
                System.out.println("Coba Lagi");
       }
        System.out.println(bil1+" "+opsi2+" "+bil2+" = "+hasil );   
        System.out.println("=================");
                
    
    }
    
}
