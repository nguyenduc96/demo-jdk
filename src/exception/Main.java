package exception;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
