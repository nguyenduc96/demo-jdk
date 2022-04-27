package di;

public class ClassA {
	private ClassB classB;

	private InterfaceA interfaceA;

	public ClassA(ClassB classB, InterfaceA interfaceA) {
		this.classB = classB;
		this.interfaceA = interfaceA;
	}

	public ClassB getClassB() {
		return classB;
	}

	public void setClassB(ClassB classB) {
		this.classB = classB;
	}

	public InterfaceA getInterfaceA() {
		return interfaceA;
	}

	public void setInterfaceA(InterfaceA interfaceA) {
		this.interfaceA = interfaceA;
	}
}
