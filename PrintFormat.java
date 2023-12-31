package String;

public class PrintFormat {

    public static void main(String[] args) {

        String nama = "Bortod";
        int umur = 21;
        double ipk = 1.5;

        System.out.printf("Nama : %s\n", nama);
        System.out.printf("Umur : %d Th.\n", umur);
        System.out.printf("IPK  : %.1f\n", ipk);

        nama = "Saradi";
        umur = 12;
        System.out.printf("%1$s anak dari Sasuki, %s Masih Berumur %d Tahun\n", nama, umur);

        int x = 10;
        int y = 14;
        int z = x - y;
        System.out.printf("%d + %d = %+d\n", x, y, z);
    }

}
