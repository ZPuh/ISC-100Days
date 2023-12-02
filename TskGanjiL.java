package task;

import java.util.Scanner;

public class TskGanjiL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = sc.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (angka % 2 != 0) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.println("Masukan Angka Ganjil");
                break;
            }

        }
        System.out.println();
    }

}
