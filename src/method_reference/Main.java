package method_reference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String s =  doAction("Duc", Utils::h);
//        System.out.println(s);
//        ExampleInterface ex = Utils::h;
//        System.out.println(ex.hello("haha"));
//        Consumer<Object> print = System.out::println;
//        print.accept("Hello");

        Main[] m = new Main[2];
        List<Main> list = new ArrayList<>();
        list.add(new Main());
        System.out.println(list.toArray(new Main[0]).length);

        if (isBlank("")){ //isBlank = true
            System.out.println("isBlank");
        }

        if (!isBlank("a")) { //isBlank = false -> !isBlank = true
            System.out.println("Not isBlank");
        }
    }


    static boolean isBlank(String str) {
        return str == null || str.trim().equals("");
    }
}
