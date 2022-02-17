package sampleCode.Point;

import java.lang.Math;

public class Point {

    // What are the advantages or disadvantages of making this public vs private?
    private int x;
    private int y;

    public Point(int x, int y) {
        // TODO: Fill out the constructor.
    }

    // Moves x by dx and y by dy.
    public void translate(int dx, int dy) {
        // TODO: Fill this out.
        // What are two ways to implement this?

    }

    public int getX() {
        // TODO: Fill this out.
        return 0;
    }

    public int getY() {
        // TODO: Fill this out.
        return 0;
    }

    public void setX(int x) {
        // TODO: Fill this out.
    }

    public void setY(int y) {
        // TODO: Fill this out.
    }

    // Return the distance from this point to p.
    public double distanceFrom(Point p) {
        // TODO: Fill this out.
        return 0;
    }


    // Discussion:
    // What is a field?
    // What is a method?
    // Accessors - conventions; get, return
    // Mutators - conventions; set, void

    public static void main(String[] args) {
        Point p = new Point(1,2);

        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());

        Point other = new Point(4,6);
        System.out.println(p.distanceFrom(other));
    }

    
}
