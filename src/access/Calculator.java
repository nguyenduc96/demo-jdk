package access;

public class Calculator {
    private int x;

    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Calculator() {
    }

    protected int cal() {
        return x * y;
    }
}
