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

    public void setToOrigin() {
        this.x = 0; this.y = 0;
    }

    public void translate(int dx, int dy) {
        this.x += dx; this.y += dy;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Point2D that) {
        return (this.x == that.getX() && this.y == that.getY());
    }


}
