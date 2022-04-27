package test_var;

public class TestVar {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);

//
//		TestVar testVar = new TestVar();
//		testVar.setup();
	String strA = "abc";

	String strB = "bcd";

	System.out.println(strA.contains(strB));


	}


	public void setup() {
		Object conn = getConnection();
		assert conn != null : "Connection is null";

		// continue with other setup ...
	}

	// Simulate failure to get a connection; using Object
	// to avoid dependencies on JDBC or some other heavy
	// 3rd party library
	public Object getConnection() {
		return null;
	}


}
