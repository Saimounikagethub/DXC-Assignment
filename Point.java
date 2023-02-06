package Dxc;
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y)
	{
	    this.x = x;
	    this.y = y;
	}

	public double distance() 
	{
	    return(Math.sqrt(x*x + y*y));
	}

	public double distance(DistanceCalculator point) {
	    int xDist = x - point.x;
	    int yDist = y - point.y;
	    return(Math.sqrt(xDist*xDist + yDist*yDist));
	}

	public int getX() {
	    return x;
	}

	public int getY() {
	    return y;
	}

}


public class PointTester {
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		System.out.println("The distance of p1 from origin is: " + p1.distance());
		Point p2 = new Point(5, 6);
		System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
		}
}