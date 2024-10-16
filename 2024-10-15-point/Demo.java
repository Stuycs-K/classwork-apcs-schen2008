public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + ((b.getY() - a.getY())*(b.getY()-a.getY())));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(10, -10);
    Point p1Copy = new Point(p1);
    Point p2Copy = new Point(p2);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    System.out.println( p1Copy);
    System.out.println(p2Copy);
    System.out.println(Point.distance(p1,p4));
    System.out.println(p4.distanceTo(p1));

    // equilateral triangle
    // Point 1 : (0,0) , Point 2: (3,0), Point 3: (1.5, sqrt(6.75))
    Point t1 = new Point(0,0);
    Point t2 = new Point(3,0);
    Point t3 = new Point(1.5,Math.sqrt(6.75));
    System.out.println(t1.distanceTo(t2));
    System.out.println(Point.distance(t1,t3));
    System.out.println(distance(t2,t3));
    System.out.println(t1.distanceTo(t2) == Point.distance(t1,t3) && distance(t1,t2) == distance(t2,t3));

  }
}
