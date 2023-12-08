package isc100days.Method;

import java.util.Scanner;

public class MetSuhu {

    public static void main(String[] args) {
        /*Buatlah method Java yang menerima suhu dalam derajat Celsius dan 
        mengembalikan suhu dalam derajat Fahrenheit. Rumus: F = (1.8 x C)+32 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Celcius : ");
        double Celcius = sc.nextDouble();
        double fahrenheit = fahrenheit(Celcius);
        System.out.println("Fahrenheit : " + fahrenheit);
    }

    private static double fahrenheit(double c) {
        double f = (1.8 * c) + 32;
        return f;
    }
}
