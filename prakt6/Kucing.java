package prakt6;

public class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void info() {
        super.info(); 
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
