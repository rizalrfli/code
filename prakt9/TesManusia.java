package prakt9;

public class TesManusia {
    public static void main(String[] args) {
        Manusia manusia; // Referensi ke superclass

        // Objek Dosen
        manusia = new Dosen();
        manusia.bernafas();
        manusia.makan(); // memanggil method makan() milik Dosen

        System.out.println();

        // Objek Mahasiswa
        manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan(); // memanggil method makan() milik Mahasiswa
    }
}
