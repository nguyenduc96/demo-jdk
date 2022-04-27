package access;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 10);
        System.out.println(calculator.cal());

        Cal2 cal2 = new Cal2(15, 20);
        System.out.println(cal2.cal());


    }

    void cla() {
        Calculator calculator = new Calculator();
        calculator.cal();
    }
}
