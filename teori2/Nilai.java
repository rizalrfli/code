public class Nilai {
    private Mahasiswa mahasiswa;
    private MataKuliah matkul;
    private Dosen dosen;
    private double nilaiAngka;

    public Nilai(Mahasiswa mahasiswa, MataKuliah matkul, Dosen dosen, double nilaiAngka) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.dosen = dosen;
        this.nilaiAngka = nilaiAngka;
    }

    public void tampilkanNilai() {
        System.out.println("Mahasiswa : " + mahasiswa.getNama() + " (" + mahasiswa.getNim() + ")");
        System.out.println("Mata Kuliah: " + matkul.getNama() + " (" + matkul.getKode() + ")");
        System.out.println("Dosen      : " + dosen.getNama());
        System.out.println("Nilai      : " + nilaiAngka);
        System.out.println("-----------------------------");
    }
}