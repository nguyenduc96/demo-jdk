package observer;

public class Main {
    public static void main(String[] args) {
        AccountService account1 = create("nguyenduc@gmail.com", "100.102.101");
        account1.login();

        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("----");

        AccountService account2 = create("nguyenduc124@gmail.com", "100.102.103");
        account2.login();

        System.out.println("----");

        account1.login();

        account1.changeStatus(LoginStatus.SUCCESS);
    }

    private static AccountService create(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
