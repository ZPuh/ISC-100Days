package Method;

import java.util.*;

public class MetArrRata {

    public static void main(String[] args) {
        //Buat method yang menerima array bilangan bulat dan mengembalikan rata-ratanya.      
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Angka " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }
        double average = calculateAverage(numbers);
        System.out.println("Rata-rata: " + average);
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

}
