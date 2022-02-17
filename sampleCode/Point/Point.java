package sampleCode.Point;

import java.lang.Math;

public class Point {

    // What are the advantages or disadvantages of making this public vs private?
    private int x;
    private int y;

    public Point(int x, int y) {
        // TODO: Fill out the constructor.
        this.x = x;
        this.y = y;
    }

    // Moves x by dx and y by dy.
    public void translate(int dx, int dy) {
        // TODO: Fill this out.
        // What are two ways to implement this?
        this.x += dx;
        this.y += dy;

    }

    public int getX() {
        // TODO: Fill this out.
        return this.x;
    }

    public int getY() {
        // TODO: Fill this out.
        return this.y;
    }

    public void setX(int x) {
        // TODO: Fill this out.
        this.x = x;
    }

    public void setY(int y) {
        // TODO: Fill this out.
        this.y = y;
    }

    // Return the distance from this point to p.
    public double distanceFrom(Point p) {
        // TODO: Fill this out.
        // sqrt((x1 - x2)^2 + (y1 - y2)^2)
        double dx = Math.pow(this.getX() - p.getX(), 2);
        double dy = Math.pow(this.getY() - p.getY(), 2);
        return Math.sqrt(dx + dy);
    }


    // Discussion:
    // What is a field?
    // What is a method?
    // Accessors - conventions; get, return
    // Mutators - conventions; set, void

    public static void main(String[] args) {
        // We are constructing an instance of the class.
        Point p = new Point(1,2);

        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());

        // p.translate(2, 4);
        // System.out.println("x: " + p.getX());
        // System.out.println("y: " + p.getY());

        Point other = new Point(4,6);
        System.out.println(p.distanceFrom(other));
    }
}
