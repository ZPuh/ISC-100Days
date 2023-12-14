package Looping;

public class PolaZ {

    public static void main(String[] args) {
        int tinggi = 5;
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi; j++) {

                if (i == 0 || i == tinggi - 1 || i + j == tinggi - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
