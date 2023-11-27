package isc100days.Arrays;
import java.util.Arrays;
public class Arr2D {
    public static void main(String[] args) {
        // Array 2 Dimensi
        int[][] Integers = {{4,8},{7,9}};
        for (int i = 0; i < Integers.length; i++) {
            for (int j = 0; j < Integers[i].length; j++) {
            System.out.print(Integers[i][j]+" ");    
            }
            System.out.println();            
        }
    }    
}
