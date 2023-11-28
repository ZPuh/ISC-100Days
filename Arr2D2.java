package isc100days.Arrays;

import java.util.Arrays;

public class Arr2D2 {
    public static void main(String[] args) {
        int[][] arrayint ={
            {4,8,2},
            {6,8,4}
        };         
        System.out.println(Arrays.toString(arrayint));
        // [[I@6acbcfc0, [I@5f184fc6]
        System.out.println(Arrays.deepToString(arrayint));
    }    
}