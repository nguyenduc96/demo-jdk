package factory;

public class BankFactory {
    private BankFactory() {};

    public static  final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK: return  new TPBank();
            case VIETINBANK: return new VietinBank();
            case VIETCOMBANK: return new VietcomBank();
            default: throw new RuntimeException("Bank type unsupported");
        }
    }
}
