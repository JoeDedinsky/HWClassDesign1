public class Circle {
    private int x;
    private int y;
    private double radius;
    private String shape = "O";

    public Circle() {

    }

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        System.out.println(shape);
    }

    public double getArea(){
        return radius * Math.PI;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "O";
    }


}
