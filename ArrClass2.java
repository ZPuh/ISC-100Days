package array;
import java.util.Arrays;
public class ArrClass2 {
    public static void main(String[] args) {
        // Comparing Arrays (Membandingkan Arrays)
        int[] angka1 = {1,2,3,4,5};
        int[] angka2 = {1,2,3,4,5};
        int[] angka3 = {5,4,3,2,1};
        
        boolean hasil = Arrays.equals(angka1, angka2);
        System.out.println("Apakah Angka1 = angka2? "+hasil); // true
        hasil = Arrays.equals(angka1, angka3);
        System.out.println("Apakah Angka1 = angka3? "+hasil); // false
    }    
}