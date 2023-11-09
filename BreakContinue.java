package breakcontinue;
public class BreakContinue {
    public static void main(String[] args) {
        // Break dan Continue
        
        // Contoh penggunaan break
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
        break; // Menghentikan loop jika i sama dengan 5
        }
        System.out.println(i);
    }

        // Contoh penggunaan continue
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
        continue; // Melanjutkan ke iterasi berikutnya jika i sama dengan 5
        }
        System.out.println(i);
    }

    }
    
}
