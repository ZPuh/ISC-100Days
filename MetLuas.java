package isc100days.Method;

import java.util.Scanner;

public class MetLuas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Panjang : ");
        int panjang = sc.nextInt();
        System.out.print("Lebar   : ");
        int lebar = sc.nextInt();
        luas(panjang , lebar);
        keliling(panjang , lebar);
    }
    public static int luas(int p,int l){
        int L = p * l ;
        System.out.println("Luas : "+L);
        return L;
    }
    public static int keliling(int p,int l){
        int K = (p + l)*2 ;
        System.out.println("Keliling : "+K);
        return K;
    }
}
