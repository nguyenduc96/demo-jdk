package maker;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;

public class Main implements Serializable {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Test1 t = new Test1();
		UseMaker useMaker = new UseMaker();
		Delete delete = new Delete();
		Test2 test2 = new Test2();

    String a = "";
    a.getBytes(StandardCharsets.UTF_8);
//		Flow.Publisher<T> delete1 = delete::delete;

		System.out.println("Test 2 ------");
		delete.delete(test2);
		System.out.println("Test 1 ------");
		delete.delete(t);
		System.out.println("usermaker ------");
		delete.delete(useMaker);
	}


}
