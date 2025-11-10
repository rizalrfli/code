package prakt9;

public class Mahasiswa extends Manusia {
    @Override
    void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }

    void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar semalaman");
    }
}
