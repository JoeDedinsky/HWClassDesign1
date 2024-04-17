/* Answers to questions

1 & 2 3. private means that the variable can only be augmented within
the class, i.e. other classes can't directly modify it, they would
need to create an object of the class and call methods from this object.

 */

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int nX) {
        this.x = nX;
    }

    public void setY(int nY) {
        this.y = nY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point2D() { }

    public void setToOrigin() {
        this.x = 0; this.y = 0;
    }

    public void translate(int dx, int dy) {
        this.x += dx; this.y += dy;
    }

    /* Answer to question.

    Override replaces the method from inherited classes.

     */

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Point2D that) {
        return (this.x == that.getX() && this.y == that.getY());
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.setToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b);
        System.out.println(c);
        // Question: Why don’t you need c.toString() here?
        /* We don't need the "toString" method because when an object is a parameter
        inside the "println" method, it automatically calls the "toString" method.
        I think this is correct, but not 100% about my answer.
         */

        System.out.println("Are b and c equal: " + b.equals(c));
    }


}
