package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        // Membuat deret fibonacci menggunakan for loop        
        Scanner sc = new Scanner (System.in);
        int f0 = 0;
        int f1 = 1;
        System.out.println("-------------------");        
        System.out.println("Deret Fibonacci");
        System.out.println("-------------------");        
        System.out.print("Masukkan Jumlah n : ");        
        int n = sc.nextInt();
        System.out.println("-------------------");
        int fn;         
        
        System.out.println("0 + 1 = "+f1);
        for (int i = 1; i < n; i++) {
            fn = f1+f0;
            System.out.println(f1+" + "+f0+" = "+fn);
            f0 = f1;
            f1 = fn;
        }        
        System.out.println("-------------------");
   }
    
}
