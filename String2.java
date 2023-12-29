package String;

public class String2 {

    public static void main(String[] args) {

        // substring
        String str = "Manusia Biasa";
        System.out.println("Hewan " + str.substring(8));
        System.out.println(str.substring(0, 7) + " B Aja");

        // replace
        String name = "Muhammad Zuhdi";
        String ganti = name.replace("Zuhdi", "Sumbul");
        System.out.println(ganti);

        // compare
        String nama1 = "Zuhdi";
        String nama2 = "Didi";
        System.out.println(nama1.compareTo(nama2));
        System.out.println(nama2.compareTo(nama1));

    }

}
