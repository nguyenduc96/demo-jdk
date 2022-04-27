package variable_syntax;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VariableSyntax {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        String result = list.stream()
                .map((var x) -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(result);

        List<String> list2 = List.of("a", "b", "c", null);
        String result2 = list2.stream().filter(Objects::nonNull)
                .map((var x) -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(result2);
    }
}
