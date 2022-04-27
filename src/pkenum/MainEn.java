package pkenum;

public class MainEn {
    public static void main(String[] args) {
        System.out.print("RED".equals(EnumTest.BLUE.toString()));
        EnumTest enumTest = EnumTest.RED;
        System.out.println(enumTest);
    }
}
