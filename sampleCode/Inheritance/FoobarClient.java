package sampleCode.Inheritance;

public class FoobarClient {
    public static void main(String[] args) {
        Foo[] elements = {new Foo(), new Bar(), new Baz(), new Mumble()};

        for(int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
}
