package day8;
public class Day8 {
    public static void main(String[] args) {
    //Augmented Assignments (Operator Penugasan)
    //a += 10 -> a = a + 10
    //a -= 10 -> a = a - 10
    //a *= 10 -> a = a * 10
    //a /= 10 -> a = a / 10
    //a %= 10 -> a = a % 10
    System.out.println("===OPERATOR PENUGASAN===");
    int a = 100;    
    a += 10;
    System.out.println("a + 10  = "+a);
    int b = 45;
    b -= 19;
    System.out.println("b - 19  = "+b);
    int c = 15;
    c *= 25;
    System.out.println("c x 25  = "+c); 
    int d = 625;
    d /= 125;
    System.out.println("d : 125 = "+d); 
    int e = 99;
    e %= 18;
    System.out.println("e % 18  = "+e);
    System.out.println("========================");
    System.out.println("");
    
    //Unary Operator
    //Unary = Operasi yang dilakukan pada satu variabel
    System.out.println("========OPERATOR UNARY========");
    //+ dan -
    int angka1 = 14;
    System.out.println("unary '+' 14 menjadi "+(+angka1));
    System.out.println("unary '-' 14 menjadi "+(-angka1));
    
    //Decrement (++) dan Increment (--)
    int angka2 = 4;
    angka2++;
    System.out.println("dengan '++' dari 4 menjadi "+angka2);
    
    int angka3 = 4;
    angka3--;
    System.out.println("dengan '--' dari 4 menjadi "+angka3);
            
    // kebalikan (!)
    boolean nilai = true;
    System.out.println("nilai bolean tanpa '!' = "+nilai );
    System.out.println("nilai bolean dengan '!' = " + !nilai );
    System.out.println("===============================");
    
}}