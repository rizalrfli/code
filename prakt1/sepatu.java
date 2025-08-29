public class sepatu {
    public String merk, warna, bahan;
    public int ukuran;
    public sepatu(String merk, String warna, String bahan, int ukuran) {
        this.merk = merk;
        this.warna = warna;
        this.bahan = bahan;
        this.ukuran = ukuran;
    }
    public void pakai(){
        System.out.println("Sepatu " + merk + " dengan ukuran " + ukuran + " dipakai.");
    }
    public void lepas(){
        System.out.println("Sepatu " + merk + " dilepas.");
    }
    public void cetakInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Bahan: " + bahan);
        System.out.println("Ukuran: " + ukuran);
    }
}
