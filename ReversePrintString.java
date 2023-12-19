package Looping;

import java.util.Scanner;

public class ReversePrintString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String word = sc.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i) + " ");
        }
        System.out.println();
    }

}
