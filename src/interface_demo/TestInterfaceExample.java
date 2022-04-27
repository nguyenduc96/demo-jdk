package interface_demo;

public class TestInterfaceExample {
	public static void main(String[] args) {
		String a = TestInterface.name;
		TestInterface test = new TestInterface() {
			@Override
			public String hello() {
				return null;
			}

			@Override
			public String hello(String name) {
				return TestInterface.super.hello(name);
			}
		};

		TestInterface testInterface = new TestInterface() {
			@Override
			public String hello() {
				return null;
			}

			@Override
			public String hello(String name) {
				return TestInterface.super.hello(name);
			}
		};


		System.out.println(TestInterface.isNull(test.hello()));



	}
}
