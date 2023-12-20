package Arrays;
import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        int[][] m1 ={
            {6,1,1},
            {1,3,4},
            {3,7,9}
        };
    
        int[][] m2 ={
            {5,6,1},
            {7,8,6},
            {2,7,9}
        };
    
        int[][] jumlah = new int [m1.length][m1[0].length];
    
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                jumlah [i][j] = m1[i][j] * m2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(jumlah));
        
    }
    
}
