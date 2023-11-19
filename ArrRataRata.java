package array;

import java.util.Scanner;

public class ArrRataRata {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Jumlah Index : ");
        int index = sc.nextInt();
        int[] ar = new int [index];
        double rata = 0;
        for (int i = 0; i < index; i++) {
            System.out.print("Nilai-"+(i+1)+" : ");
            double nilai = sc.nextInt();
            rata+=nilai;
        }
        System.out.println(rata/index);
    }
    
}
