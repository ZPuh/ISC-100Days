package isc100days.Method;

import java.util.Scanner;

public class MetRata {
    public static void main(String[] args) {
        /*Buatlah program Java dengan sebuah metode yang menerima sejumlah nilai
        sebagai parameter dan mengembalikan nilai rata-ratanya */
        Scanner sc = new Scanner (System.in);
        System.out.print("Banyak Nilai : ");
        int Banyak = sc.nextInt();
        
        int[] nilai = new int[Banyak];
        
        System.out.println("Masukkan Nilai : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
        }
        double mean = Ratarata(nilai);
        System.out.println("Rata Rata : "+mean);
        
    }
    private static double Ratarata (int[] nilai){
        int total = 0;
        
        for (int i : nilai) {
            total+=i;
        }        
        return (double)total/nilai.length; 
    }
    
}
