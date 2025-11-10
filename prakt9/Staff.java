package prakt9;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;
    public void setLembur (int lembur) {
        this.lembur = lembur;
    }
    public int getLembur () {
        return lembur;
    }
    public void setGajiLembur (double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    public double getGajiLembur () {
        return gajiLembur;
    }
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }
    public void lihatInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Golongan: " + getGolongan());
        System.out.println("Lembur: " + getLembur() + " jam");
        System.out.println("Gaji Lembur: " + getGajiLembur());
        System.out.println("Total Gaji: " + getGaji());
    }
}
