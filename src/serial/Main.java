package serial;

import java.io.*;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassTest classTest = new ClassTest();

        classTest.name = "Duc";
        String strO = "";

        try {
            String s = serializeObjectToString(classTest);
            System.out.println(s);
            strO = s;

        } catch (IOException e) {
            e.printStackTrace();
        }

        ClassTest classTest1 = (ClassTest) deSerializeObjectFromString(strO);
        System.out.println(classTest1);

    }

    public static Object deSerializeObjectFromString(String s)
            throws IOException, ClassNotFoundException {

        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(data));
        Object o = ois.readObject();
        ois.close();
        return o;
    }

    public static String serializeObjectToString(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(o);
        oos.close();

        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }
}
