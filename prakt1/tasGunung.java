public class tasGunung extends tas {
    public boolean rainCover;
    public int jumlahKantong;

    public tasGunung(String merk, String warna, int kapasitas, boolean rainCover, int jumlahKantong) {
        super(merk, warna, kapasitas);
        this.rainCover = rainCover;
        this.jumlahKantong = jumlahKantong;
    }

    public void pasangRainCover() {
        if (rainCover) {
            System.out.println("Rain cover terpasang.");
        } else {
            System.out.println("Tas ini tidak dilengkapi rain cover.");
        }
    }
    public void cekKantong() {
        System.out.println("Jumlah kantong: " + jumlahKantong);
    }
    public void cetakInfo(){
        System.out.println("Informasi tas gunung:");
        System.out.println("Rain Cover: " + (rainCover ? "Ya" : "Tidak"));
        System.out.println("Jumlah Kantong: " + jumlahKantong);
        infoTas();
    }
}
