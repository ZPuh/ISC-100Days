package array;
import java.util.Arrays;
public class ArrClass {
    public static void main(String[] args) {
        // Sorting Arrays (Pengurutan Array)
        int [] angka = {17, 42, 8, 56, 91};
        Arrays.sort(angka);
        System.out.println("Angka yang diurutkan :\n"+Arrays.toString(angka));
        char [] abjad = {'K','P','Q','L','S'};
        Arrays.sort(abjad);
        System.out.println("Abjad yang diurutkan :\n"+Arrays.toString(abjad));
        
        // Searching Arrays
        int[] angka2 = {29, 30, 31, 32, 33};        
        System.out.println(Arrays.binarySearch(angka2,31)); 
        // 31 berada di index 2
    }
    
}
