package isc100days.Arrays;
public class Arr2D3 {
    public static void main(String[] args) {
        int [][] Integers = {
            {1,3},
            {5,6,8}
        };
        for (int i = 0; i < Integers.length; i++) {
            for (int j = 0; j < Integers[i].length; j++) {
                System.out.print(Integers[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
