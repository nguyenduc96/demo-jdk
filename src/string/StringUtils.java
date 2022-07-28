package string;

public final class StringUtils {


    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public static <T> T rqu(T obj) {
        return obj;
    }

}
