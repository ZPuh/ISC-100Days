package Method;

import java.util.Scanner;

public class faktorialRecursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int num = input.nextInt();
        int hasilFaktorial = hitungFaktorial(num);
        System.out.println("Faktorial dari " + num + " = " + hasilFaktorial);
    }

    private static int hitungFaktorial(int angka) {
        if (angka == 1) {
            return angka;
        }

        return angka * hitungFaktorial(angka - 1);
    }
}
