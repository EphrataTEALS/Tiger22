package Bird;

public class BirdClient {
    
    public static void main(String[] args) {

        // example of Overriding a method
        Bird b = new Bird();
        b.shoot();

        LarryBird l = new LarryBird();
        l.shoot();

        SueBird s = new SueBird();
        s.shoot();

    }
}
