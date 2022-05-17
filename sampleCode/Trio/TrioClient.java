public class TrioClient {
    
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("Cheeseburger", 2.75);
        Salad salad = new Salad("Spinach Salad", 1.25);
        Drink drink = new Drink("Orange Soda", 1.25);

        Trio trio = new Trio(sandwich, salad, drink);

        // Should print "Cheeseburger/Spinach Salad/Orange Soda Trio"
        System.out.println(trio.getName());
        // Should print 4.00
        System.out.println(trio.getPrice());
    }
}
