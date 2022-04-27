package interface_demo;

@FunctionalInterface
public interface TestInterface {
	String name = "Nguyen duc";

	String hello();

	default String hello(String name) {
		return name;
	}

	static boolean isNull(String str) {
		return str == null;
	}
}
