package operatorlogikaboolean;
public class OperatorLogikaBoolean {
    public static void main(String[] args) {
        //OPERASI LOGIKA/BOOLEAN 
        // AND (&&)
        // OR (||)
        // XOR (^)
        // NOT (!)
        System.out.println("======= AND (&&) =======");
        // jika salah satu variabel bernilai false maka hasilnya adalah false
        boolean a,b,c;
        a = true;
        b = true;
        c = a&&b;
        System.out.println(a+"  && "+b+"  = "+c);
        a = false;
        b = true;
        c = a&&b;
        System.out.println(a+" && "+b+"  = "+c);
        a = true;
        b = false;
        c = a&&b;
        System.out.println(a+"  && "+b+" = "+c);
        a = false;
        b = false;
        c = a&&b;
        System.out.println(a+" && "+b+" = "+c);
        System.out.println("======= OR (||) =======");
        // jika salah satu variabel bernilai false maka hasilnya adalah false       
        a = true;
        b = true;
        c = a||b;
        System.out.println(a+"  || "+b+"  = "+c);
        a = false;
        b = true;
        c = a||b;
        System.out.println(a+" || "+b+"  = "+c);
        a = true;
        b = false;
        c = a||b;
        System.out.println(a+"  || "+b+" = "+c);
        a = false;
        b = false;
        c = a||b;
        System.out.println(a+" || "+b+" = "+c);
        System.out.println("======= XOR (^) =======");
        /* XOR diibaratkan pekalian/pembagian dalam operasi matematika true(-)&
           false(+)*/
        a = true;
        b = true;
        c = a^b;
        System.out.println(a+"  ^ "+b+"  = "+c);
        a = false;
        b = true;
        c = a^b;
        System.out.println(a+" ^ "+b+"  = "+c);
        a = true;
        b = false;
        c = a^b;
        System.out.println(a+"  ^ "+b+" = "+c);
        a = false;
        b = false;
        c = a^b;
        System.out.println(a+" ^ "+b+" = "+c);
        System.out.println("======= NOT (!) =======");
        // NOT Adalah kebalikan, jika nilainya true maka hasilnya adalah false,begitu juga sebaliknya
        a = true;
        c = !a;
        System.out.println(a+"  --> ! = "+c);
        a = false;
        c = !a;
        System.out.println(a+" --> ! = "+c);
        System.out.println("========================");
        
    } 
}
