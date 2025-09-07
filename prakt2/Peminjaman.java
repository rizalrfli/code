public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;     
    public int lamaSewa;   
    public int hargaBayar;

    public int hitungHarga(){
        hargaBayar = harga * lamaSewa;
        return hargaBayar;
    }
    
    public void tampilDataPeminjaman(){
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga Sewa    : Rp " + harga);
        System.out.println("Lama Sewa     : " + lamaSewa + " jam");
        System.out.println("Total Bayar   : " + hitungHarga());
    }
}
