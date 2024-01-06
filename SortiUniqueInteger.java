package ArrayList;

import java.util.*;

public class SortiUniqueInteger {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Masukkan 5 Angka : ");
        Scanner inputUser = new Scanner(System.in);
        int n;
        for (int i = 0; i < 5; i++) {
            n = inputUser.nextInt();

            if (!integers.contains(n)) {
                integers.add(n);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);
    }

}
