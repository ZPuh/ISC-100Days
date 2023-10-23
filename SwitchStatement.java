package switchstatement;
public class SwitchStatement {
    public static void main(String[] args) {
    // Switch Statement
    // Switch adalah statement percabangan yang sama dengan if.Namun lebih sederhana
    // Switch hanya menggunakan perbandingan (==)
    
    var nilai = "A";            
    switch (nilai){
        case "A":
            System.out.println("Anda Hebat,Pertahankan!");
            break;
        case "B":
        case "C":
            System.out.println("Bagus,Tingkatkan!");
            break;
        case "D":
            System.out.println("Sayang Banget,Coba Lagi Tahun Depan :(");
            break;
        default:
            System.out.println("Hmm Gimana yah,Keknya Kamu salah jurusan Deh");
    }
    // Switch Lambda
    // Ini lebih mempermudah saat penggunaan switch expresion karna tidak perlu
    // lagi menggunakan kata kunci break
    
    switch (nilai){
        case "A" -> System.out.println("Anda Hebat,Pertahankan!");
        case "B" ,"C" -> System.out.println("Bagus,Tingkatkan!");
        case "D" -> System.out.println("Sayang Banget,Coba Lagi Tahun Depan :(");
        default ->{
            System.out.println("Hmm Gimana yah,Keknya Kamu salah jurusan Deh");
        }           
    }
    // Kata Kunci Yield
    // Mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
    
    String ucapan = switch (nilai){
        case "A":
            yield "Anda Hebat,Pertahankan!";         
        case "B","C":
            yield "Bagus,Tingkatkan!";
        case "D":
            yield "Sayang Banget,Coba Lagi Tahun Depan :(";
        default:
            yield "Hmm Gimana yah,Keknya Kamu salah jurusan Deh";
    };
        System.out.println(ucapan);
    
    }
    
}

