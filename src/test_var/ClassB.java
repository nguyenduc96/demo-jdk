package test_var;

import java.util.Objects;

public class ClassB {
    private String name;

    public ClassB() {
    }

    public ClassB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassB)) return false;
        ClassB classB = (ClassB) o;
        return Objects.equals(getName(), classB.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
