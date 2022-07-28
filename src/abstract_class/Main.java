package abstract_class;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        if (classA instanceof  AbstractClass) {
            classA.run();
        }
        if (classA instanceof  InterfaceTest) {
            classA.run();
        }
    }
}
