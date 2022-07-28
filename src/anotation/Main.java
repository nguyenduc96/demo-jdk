package anotation;

public class Main {
    public static void main(String[] args) {
        System.out.println(Example.class
                .getAnnotation(Settings.class)
                .name());
    }
}
