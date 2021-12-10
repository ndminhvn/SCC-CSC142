package coordinate;

public class PointClient {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("START OF PROGRAM");

        //Test Point
        System.out.println();
        System.out.println("Test Point Coordinate");
        System.out.println("x: " + new Point(1,3).getX());
        System.out.println("y: " + new Point(1,3).getY());
        new Point(1,3).setX(2);
        new Point(1,3).setY(4);

        //Test distance
        System.out.println();
        System.out.println("Test distance method");
        Point p1 = new Point(1,3);
        Point p2 = new Point(4,7);
        System.out.println(p1.distance(p2));

        //Test isHorizontal
        System.out.println();
        System.out.println("Test isHorizontal method");
        Point p3 = new Point(1,3);
        Point p4 = new Point(4,3);
        System.out.println(p3.isHorizontal(p4));

        //Test isVertical
        System.out.println();
        System.out.println("Test isVertical method");
        Point p5 = new Point(1,3);
        Point p6 = new Point(1,5);
        System.out.println(p5.isVertical(p6));

        //Test isCollinear
        System.out.println();
        System.out.println("Test isCollinear method");
        Point p7 = new Point(1,3);
        Point p8 = new Point(4,7);
        Point p9 = new Point();
        System.out.println(p7.isCollinear(p8,p9));

        //Test slope
        System.out.println();
        System.out.println("Test slope method");
        Point p10 = new Point(1,3);
        Point p11 = new Point(4,7);
        System.out.println(p10.slope(p11));

        //Test equals
        System.out.println();
        System.out.println("Test equals method");
        Point p12 = new Point(4,7);
        Point p13 = new Point(4,7);
        System.out.println(p12.equals(p13));

        //Test setLocation
        System.out.println();
        System.out.println("Test setLocation method");
        System.out.println(p9.setLocation(3,6));

        //Test move
        System.out.println();
        System.out.println("Test move method");
        System.out.println(p9.move(3,4));
    }
}
