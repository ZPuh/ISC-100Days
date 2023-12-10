package isc100days.Method;

import java.util.Scanner;

public class MetJilNap {

    public static void main(String[] args) {
        /*Buatlah method Java yang menerima sebuah bilangan sebagai parameter dan
        mencetak apakah bilangan tersebut ganjil atau genap. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int bil = sc.nextInt();
        GanjilatauGenap(bil);
    }

    private static void GanjilatauGenap(int bilangan) {
        if (bilangan % 2 == 1) {
            System.out.println(bilangan + " Adalah Bilangan Ganjil");
        } else {
            System.out.println(bilangan + " Adalah Bilangan Genap");
        }
    }
}
