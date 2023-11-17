package array;
public class Maksimal {
    public static void main(String[] args) {
        // Program Nilai Maksimal
        int[] numbers = {10, 7, 23, 45, 14, 28, 39}; 

        int max = numbers[0]; 
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }    
}
