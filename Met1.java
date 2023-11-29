package isc100days.Method;
public class Met1 {
    public static void main (String[] args) {
        int w,z;        
        w = 5;
        z = fungsi(w);
        System.out.println("Hasil : "+z);
        
        w = 10;
        z = fungsi(w);
        System.out.println("Hasil : "+z);
    }
    static int fungsi (int x){
        int y;        
        y = x * x;        
        return y;
    }
}
