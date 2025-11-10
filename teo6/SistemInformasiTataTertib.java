public class SistemInformasiTataTertib {
    private Pelanggaran[] daftarPelanggaran;
    private int jumlahPelanggaran;
    private static final int KAPASITAS_MAKSIMAL = 100;

    public SistemInformasiTataTertib() {
        this.daftarPelanggaran = new Pelanggaran[KAPASITAS_MAKSIMAL];
        this.jumlahPelanggaran = 0;
    }
    public void catatPelanggaran(Pelanggaran pelanggaran) {
        if (jumlahPelanggaran < KAPASITAS_MAKSIMAL) {
            daftarPelanggaran[jumlahPelanggaran] = pelanggaran;
            jumlahPelanggaran++;
            System.out.println("Pencatatan berhasil: Pelanggaran oleh " + pelanggaran.getPelanggar().getNama() + " telah direkam.");
        } else {
            System.out.println("Pencatatan gagal: Penyimpanan data pelanggaran sudah penuh.");
        }
    }
    public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
        System.out.println("\n--- Riwayat Pelanggaran untuk: " + anggota.getNama() + " (ID: " + anggota.getId() + ") ---");
        boolean ditemukan = false;
        int nomor = 1;

        for (int i = 0; i < jumlahPelanggaran; i++) {
            Pelanggaran p = daftarPelanggaran[i];

            if (p.getPelanggar().getId().equals(anggota.getId())) {
                System.out.println(nomor + ". Tanggal    : " + p.getTanggal());
                System.out.println("   Pelanggaran: " + p.getPeraturanDilanggar().getPeraturan());
                System.out.println("   Sanksi     : " + p.getPeraturanDilanggar().getSanksi());
                ditemukan = true;
                nomor++;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada riwayat pelanggaran yang ditemukan.");
        }
        System.out.println("----------------------------------------------------");
    }
}