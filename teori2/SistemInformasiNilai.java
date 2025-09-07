public class SistemInformasiNilai {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("2211001", "Rizal Rafli");
        Dosen d1 = new Dosen("19781234", "Dr. Andi");
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3);

        Nilai n1 = new Nilai(m1, mk1, d1, 88.5);
        n1.tampilkanNilai();
    }
}