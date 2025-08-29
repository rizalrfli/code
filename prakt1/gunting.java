public class gunting {
    public int panjang;
    public String jenisPegangan, merk;

    public gunting(int panjang, String jenisPegangan, String merk) {
        this.panjang = panjang;
        this.jenisPegangan = jenisPegangan;
        this.merk = merk;
    }
    public void memotong() {
        System.out.println("Gunting sedang memotong");
    }
    public void menutup() {
        System.out.println("Gunting sedang menutup");
    }
    public void cetakInfo(){
        System.out.println("Panjang: " + panjang);
        System.out.println("Jenis Pegangan: " + jenisPegangan);
        System.out.println("Merk: " + merk);
    }
}
