package inner_class;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Duc");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.msg();
        innerClass.msg2();
    }
}
