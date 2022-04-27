package inner_class;

public class OuterClass {
    private String name;

    public OuterClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class  InnerClass implements InnerInterface, InterfaceInner {
        @Override
        public void msg() {
            System.out.println("Hello, " + getName());
        }

        @Override
        public void msg2() {
            System.out.println("Hello, " + getName());
        }
    }

    interface InnerInterface {
        void msg();
    }
}
