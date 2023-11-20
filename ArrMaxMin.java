package array;
public class ArrMaxMin {
    public static void main(String[] args) {       
        int[] ar = {35,35,275,65,235,67,34};
        int jml = ar.length;
        int max = ar[0];
        int min = ar[0];
        System.out.print("Deret : ");
        for (int i = 0; i < jml; i++) {
            System.out.print(ar[i]+" ");
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println();
        System.out.println("Bilangan Terbesar : "+max);
        System.out.println("Bilangan Terkecil : "+min);
    }
    
}
