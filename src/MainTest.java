import interface_demo.TestInterface;
import interface_demo.TestInterfaceExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
//		String rx = "^[1-9a-zA-Z]*";
//		String test ="!2d";
//		System.out.println(test.matches(rx));
		TestInterface<TestInterfaceExample> tf = TestInterfaceExample::new;
		tf.hello("alo");
		List<TestInterface> l = new ArrayList<>();
		l.add(new TestInterface() {
			@Override
			public Object hello(String name) {
				return name;
			}
		});
		l.add(new TestInterface() {
			@Override
			public Object hello(String name) {
				return name;
			}
		});




		TestInterface<?>[] t = l.toArray(new TestInterface[0]);



		System.out.println(Arrays.toString(t));
	}
}
