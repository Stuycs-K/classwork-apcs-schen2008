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

  }
}
