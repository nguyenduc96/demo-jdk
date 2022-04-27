package di;

import java.util.Objects;

public class ClassB{
	String name;

	String id;

	public ClassB(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public ClassB() {
	}


//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (!(o instanceof ClassB)) return false;
//		ClassB classB = (ClassB) o;
//		return Objects.equals(name, classB.name) && Objects.equals(id, classB.id);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, id);
//	}
//

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof ClassB)) return false;
		ClassB classB = (ClassB) obj;
		return Objects.equals(id, classB.id) && Objects.equals(name, classB.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}
}
