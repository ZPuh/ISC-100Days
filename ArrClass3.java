package array;
import java.util.Arrays;
public class ArrClass3 {
    public static void main(String[] args) {
        // Filling Arrays (Arrays.fill)
        // fill (Arrays,Nilai) 
        int[] angka = new int [5];//{0,0,0,0,0}
        Arrays.fill(angka,8); //{8,8,8,8,8}
        for (int nilai : angka) {
            System.out.print(" "+nilai);
        }
        System.out.println();
        String[] kata = new String[5];//{null,null,null,null,null}
        Arrays.fill(kata, "Waduh");//{waduh,waduh,waduh,waduh,waduh}
        for (String kata2 : kata) {
            System.out.print(" "+kata2);
        }
        System.out.println();
        // Printing Arrays (Arrays.tostring)
       int[] num = {4,3,6,5,1};
        System.out.println("Isi Arrays :\n"+Arrays.toString(num));
    }
    
}
