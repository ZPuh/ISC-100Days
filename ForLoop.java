package forloop;
public class ForLoop {
    public static void main(String[] args) {
    //Perulangan For
    
    //Perulangan Tanpa Henti
        for (;;) {
            System.out.println("Perulangan Tanpa Henti");
            break;
        }
    //Perulangan Dengan Kondisi
        var i = 1;
        for (; i <= 10;) {
            System.out.println(i);
            i++;
        }
    //Perulangan Dengan init Statement
        for (int j = 1; j <= 10;) {
            System.out.println(j);
            j++;
        }
    //Perulangan Dengan Post Statement
        //For Up To (forward)
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }
        //For Down To (backward)
        for (int l = 10; l >= 1; l--) {
            System.out.println(l);
        }
    }
    
}
