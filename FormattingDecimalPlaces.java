package Method;

public class FormattingDecimalPlaces {

    /*
Setiap angka harus diformat sehingga dibulatkan menjadi dua tempat desimal. 
Anda tidak perlu memeriksa apakah yang dimasukkan adalah angka yang valid karena hanya angka valid yang digunakan dalam pengujian.

Example:    
5.5589 is rounded 5.56   
3.3424 is rounded 3.34*/
    public static void main(String[] args) {
        System.out.println(TwoDecimalPlaces(5.5589)); // Output: 5.56
        System.out.println(TwoDecimalPlaces(3.3424)); // Output: 3.34
    }

    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
