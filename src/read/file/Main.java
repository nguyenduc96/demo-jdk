package read.file;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("cv.txt");
            try {
                ObjectInputStream os = new ObjectInputStream(is);
                String s = String.valueOf(os.readByte());
                System.out.println(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
