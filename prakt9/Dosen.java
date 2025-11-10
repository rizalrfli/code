package prakt9;

public class Dosen extends Manusia {
    @Override
    void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa");
    }

    void lembur() {
        System.out.println("Dosen lembur menyiapkan materi kuliah");
    }
}
