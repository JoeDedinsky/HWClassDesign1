public class Main {
    public static void main(String[] args) {

        Date currentDate = new Date();

        currentDate.setDate(4, 9, 2024);

        System.out.println("Hello world!");
        System.out.println("Today's Date is: " + currentDate);


        Point2D firstPoint = new Point2D(0, 0);
        Point2D secondPoint = new Point2D(5, 10);

        System.out.println(firstPoint);
        System.out.println(secondPoint);

        System.out.println(firstPoint.equals(secondPoint));
    }
}