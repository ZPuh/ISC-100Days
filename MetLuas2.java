package isc100days.Method;

import java.util.Scanner;

public class MetLuas2 {
    public static void main(String[] args) {
    /*Buatlah sebuah metode Java yang menerima Alas dan tinggi sebagai parameter
      dan mengembalikan luas dari Segitiga. */    
        Scanner sc = new Scanner (System.in); 
        System.out.print("Alas   : ");
        double alas = sc.nextInt();
        System.out.print("Tinggi : ");
        double tinggi = sc.nextInt();
        luas(alas,tinggi);
    }
    private static double luas (double a,double t){
        double luas = (a*t)/2;
        System.out.println("Luas     : "+luas);
        return luas;
    }
}
