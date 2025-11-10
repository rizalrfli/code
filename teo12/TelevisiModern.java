public class TelevisiModern extends Elektronik {
    private String modelInput;  // Variabel untuk model input

    public TelevisiModern() {
        super();  // Memanggil konstruktor Elektronik
        this.modelInput = "HDMI";  // Set default model input
    }

    public String getModelInput() {
        return modelInput;  // Mengembalikan model input
    }
}
