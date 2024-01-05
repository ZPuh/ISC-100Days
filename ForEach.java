package ArrayList;

import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args) {        
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Adit");
        nameList.add("Nia");
        nameList.add("Rina");
        nameList.add("Rizky");

        // For Each pada ArrayList
        for (String nameEach : nameList) {
            System.out.println(nameEach);
        }
    }

}
