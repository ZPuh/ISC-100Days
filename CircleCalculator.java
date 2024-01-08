package Method;

import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jari-JAri : ");
        float jariJari = sc.nextFloat();

        float luas = luasLingkaran(jariJari);
        float keliling = kelilingLingkaran(jariJari);

        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);

    }

    private static float luasLingkaran(float r) {
        return 3.14f * r * r;
    }

    private static float kelilingLingkaran(float r) {
        return 3.14f * (r + r);
    }
}
