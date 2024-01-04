package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(4);
        Numbers.add(7);
        Numbers.add(0);
        Numbers.add(8);
        Numbers.add(-3);

        // Looping di ArrayList
        for (int i = 0; i < Numbers.size(); i++) {
            System.out.print(Numbers.get(i) + " ");
        }
        System.out.println();

        // Mengurutkan ArrayList menggunakan metode sort()
        System.out.println(Numbers);
        Collections.sort(Numbers);
        System.out.println(Numbers);
    }

}
