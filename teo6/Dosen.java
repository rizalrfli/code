public class Dosen extends AnggotaKampus {
    private String nip;
    private String departemen;

    public Dosen(String nama, String id, String nip, String departemen) {
 
        super(nama, id);
        this.nip = nip;
        this.departemen = departemen;
    }

    // Getter untuk NIP
    public String getNip() {
        return nip;
    }

    // Getter untuk Departemen
    public String getDepartemen() {
        return departemen;
    }
}