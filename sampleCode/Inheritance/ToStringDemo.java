public class ToStringDemo {

    private String name;

    public ToStringDemo(String name) {
        this.name = name;
    }

    public String toString() {
        return "ToStringDemo : " + name;
    }

    public static void main(String[] args) {
        ToStringDemo bob = new ToStringDemo("bob");
        System.out.println(bob);
        System.out.println(bob.toString());

        ToStringDemo alice = new ToStringDemo("alice");
        System.out.println(alice);
    }
    
}
