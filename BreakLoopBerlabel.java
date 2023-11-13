package breakloopberlabel;
public class BreakLoopBerlabel {
    public static void main(String[] args) {
        //Break Loop Dengan Label
        
        LabelLuar: // Label untuk perulangan luar
        for (int i = 1; i <= 3; i++) {
            LabelDalam: // Label untuk perulangan dalam
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);

                if (j == 2) {
                    // Menggunakan break dengan label untuk menghentikan perulangan dalam
                    break LabelDalam;
                }
            }
        }
    }    
}