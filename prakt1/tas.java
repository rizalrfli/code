public class tas {
    public String merk, warna;
    public int kapasitas;

    public tas(String merk, String warna, int kapasitas) {
        this.merk = merk;
        this.warna = warna;
        this.kapasitas = kapasitas;
    }

    public void isiBarang(String newValue) {
        System.out.println("Mengisi tas dengan: " + newValue);
    }

    public void kosongkan(String dust) {
        System.out.println("Mengosongkan tas dari: " + dust);
    }

    public void infoTas() {
        System.out.println("Informasi tas:");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Kapasitas: " + kapasitas + " liter");
    }
}
