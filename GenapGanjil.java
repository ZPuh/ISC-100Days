package genapganjil;
import java.util.Scanner;
public class GenapGanjil {
    public static void main(String[] args) {
        //Membuat program bilangan ganjil&genap dari angka terbesar  ke terkecil
        
        Scanner sc = new Scanner (System.in);        
        // Program Bilangan Genap
        System.out.println("=====BILANGAN GENAP=====");
        System.out.print("Bilangan Terbesar : ");
        int z = sc.nextInt();
        System.out.print("Bilangan Terkecil : ");
        int x = sc.nextInt();        
        
        if (z > x) {
            for (int i = z; i >= x; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");                    
                }
            }
        } else {
            System.out.println("Masukkan Bilangan Terbesar Lebih Besar dari Bilangan Terkecil");            
        } 
        System.out.println();
              
        // Program Bilangan Ganjil
        System.out.println("=====BILANGAN GANJIL=====");
        System.out.print("Bilangan Terbesar : ");
        int c = sc.nextInt();
        System.out.print("Bilangan Terkecil : ");
        int v = sc.nextInt();        
        
        if (c > v) {
            for (int i = c; i >= v; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");                    
                }
            }
        } else {
            System.out.println("Masukkan Bilangan Terbesar Lebih Besar dari Bilangan Terkecil");            
        } 
        System.out.println();
        System.out.println("=========================");
    
    }
    
}
