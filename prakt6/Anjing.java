package prakt6;

public class Anjing extends Mamalia {
    private String jenisBulu;

    public Anjing(String nama, int umur, String jenisBulu) {
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }
    public String getJenisBulu() {
        return this.jenisBulu;
    }
}