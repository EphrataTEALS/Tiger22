package Water;
public class WaterClient {

    public static void main(String[] args) {

        // example of Overriding a method
        Pond[] ponds = { new Ocean(), new Pond(), new Lake(), new Bay() };
        for (Pond p : ponds) {
            p.method1();
            System.out.println();
            p.method2();
            System.out.println();
            p.method3();
            System.out.println("\n");
        }

        
    }
    
}
