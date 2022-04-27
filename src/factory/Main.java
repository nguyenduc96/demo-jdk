package factory;

public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        bank.getBankName();
    }
}
