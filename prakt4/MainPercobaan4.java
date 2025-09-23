package prakt4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        
        // Untuk pertanyaan 4 - menambah penumpang Budi
        System.out.println("\n=== Menambah Penumpang Budi ===");
        Penumpang budi = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(budi, 1);
        gerbong.setPenumpang(budi, 2); 
        
        System.out.println(gerbong.info());
    }
}