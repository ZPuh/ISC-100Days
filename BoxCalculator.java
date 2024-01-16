package Arrays;

import java.util.Scanner;

public class BoxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lebar : ");
        int lebar = sc.nextInt();
        System.out.print("Panjang : ");
        int panjang = sc.nextInt();
        System.out.print("Tinggi : ");
        int tinggi = sc.nextInt();

        int[] hasil = getSize(lebar, panjang, tinggi);

        System.out.println("Luas Permukaan: " + hasil[0]);
        System.out.println("Volume: " + hasil[1]);
    }

    public static int[] getSize(int l, int p, int t) {
        int luasPermukaan = 2 * (l * p + p * t + t * l);
        int volume = l * p * t;

        return new int[]{luasPermukaan, volume};
    }
}
