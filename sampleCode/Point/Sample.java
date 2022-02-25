package sampleCode.Point;

public class Sample {

    public static void main(String[] args) {
        Point p = new Point(1,2);
        p.x = 1;

        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());

        Point other = new Point(4,6);
        System.out.println(p.distanceFrom(other));
    }
    
}
