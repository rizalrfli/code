public class Main {
    public static void main(String[] args) {
        SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();

        TataTertib aturan1 = new TataTertib("Dilarang merokok di area gedung perkuliahan", "Peringatan Tertulis 1");
        TataTertib aturan2 = new TataTertib("Tidak mengenakan pakaian berkerah saat perkuliahan", "Teguran Lisan");
        TataTertib aturan3 = new TataTertib("Terlambat mengumpulkan tugas lebih dari 3 hari", "Pengurangan Nilai Tugas");

        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "MHS001", "2151502001", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Citra Lestari", "MHS002", "2151504002", "Sistem Informasi");
        Dosen dosen1 = new Dosen("Dr. Indah Kurnia", "DSN001", "198005102005012001", "Departemen Ilmu Komputer");

        System.out.println("========= SIMULASI PENCATATAN PELANGGARAN =========\n");
        Pelanggaran p1 = new Pelanggaran(mhs1, aturan2, "2025-10-01");
        sistem.catatPelanggaran(p1);
        Pelanggaran p2 = new Pelanggaran(mhs2, aturan1, "2025-10-02");
        sistem.catatPelanggaran(p2);
        Pelanggaran p3 = new Pelanggaran(mhs1, aturan3, "2025-10-03");
        sistem.catatPelanggaran(p3);
        System.out.println("\n========= SIMULASI MELIHAT RIWAYAT PELANGGARAN ==========");
        sistem.lihatRiwayatPelanggaran(mhs1); 
        sistem.lihatRiwayatPelanggaran(mhs2); 
        sistem.lihatRiwayatPelanggaran(dosen1); 

        System.out.println("\n========= SIMULASI PENERAPAN SANKSI ==========");
        aturan1.terapkanSanksi(mhs2);
    }
}