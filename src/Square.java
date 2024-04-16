public class Square {

    private int x;
    private int y;
    private double side;
    private String shape = "[]";

    public Square() {

    }

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Square (int x, int y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public void draw(){
        System.out.println(shape);
    }

    public double getArea(){
        return side * side;
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

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString(){
        return "[]";
    }


}
