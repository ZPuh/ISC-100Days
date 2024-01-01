package String;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // Mengecek Sebuah Kata apakah termasuk palindrome
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Kata : ");
        String kata1 = sc.next();
        String kata2 = "";

        for (int i = kata1.length() - 1; i >= 0; i--) {
            char k = kata1.charAt(i);
            kata2 += String.valueOf(k);
        }
        if (kata1.equalsIgnoreCase(kata2)) {
            System.out.println("Termasuk Palindrome");
        } else {
            System.out.println("Tidak termasuk  Palindrome");
        }
    }

}
