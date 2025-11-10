public class TelevisiJadul extends Elektronik {
    private String modelInput;  // Variabel untuk model input

    public TelevisiJadul() {
        super();  // Memanggil konstruktor Elektronik
        this.modelInput = "DUI";  // Set default model input
    }

    public String getModelInput() {
        return modelInput;  // Mengembalikan model input
    }
}
