public class ToStringDemo {

    private String name;

    public ToStringDemo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ToStringDemo bob = new ToStringDemo("bob");
        System.out.println(bob);

        ToStringDemo alice = new ToStringDemo("alice");
        System.out.println(alice);
    }
    
}
