public class TestGasStation {
    public static void main(String[] args) {
        MobilKuno carry = new MobilKuno();
        MobilMewah alphard = new MobilMewah();
        GasStation gs = new GasStation();
        gs.isiBahanBakar("carry",20000);
        gs.isiBahanBakar("alphard",20000);
    }
}

