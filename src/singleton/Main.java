package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
        System.out.println(singletonPattern == singletonPattern2);


    }
}
