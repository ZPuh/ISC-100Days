package String;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("batu / gunting / kertas");
        System.out.print("Pemain 1 : ");
        String p1 = sc.next();
        System.out.print("Pemain 2 : ");
        String p2 = sc.next();

        System.out.println(rps(p1, p2));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Seri!";
        } else if ((p1.equals("batu") && p2.equals("gunting"))
                || (p1.equals("gunting") && p2.equals("kertas"))
                || (p1.equals("kertas") && p2.equals("batu"))) {
            return "Pemain 1 Menang!";
        } else {
            return "Pemain 2 Menang!";
        }
    }
}
