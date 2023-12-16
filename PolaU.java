package Looping;

public class PolaU {

    public static void main(String[] args) {
        int u = 5;
        for (int i = 0; i < u; i++) {
            for (int j = 0; j < u; j++) {
                if ((j == 0 || j == u - 1) || (i == u - 1 && (j > 0 && j < u - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
