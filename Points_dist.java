/*
 Input the coordinates of three points P1, P2 and P3 in a plane. Calculate and the distance
 between P1 and P2 as well as P1 and P3. [Use overloaded methods to calculate the distance
 based on the type of arguments passed]
 */

package Points_dist;

/**
 * @author: Pavan Kumar
 */


import java.util.*;
class Point{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    double distance(int x,int y)
    {
        int dx=this.x-x;
        int dy=this.y-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    double distance(Point p){
        return distance(p.x,p.y);
    }
}
public class Points_dist {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter point1: ");
	int x=s.nextInt();
	int y=s.nextInt();
        Point p1=new Point(x,y);
        System.out.println("Enter point2: ");
	x=s.nextInt();
	y=s.nextInt();
        Point p2=new Point(x,y);
        System.out.println("Enter point3: ");
	x=s.nextInt();
	y=s.nextInt();
        Point p3=new Point(x,y);
        System.out.println("Enterered coordinates of tree points are: ");
        System.out.println("P1:("+p1.x+","+p1.y+")");
        System.out.println("P2:("+p2.x+","+p2.y+")");
        System.out.println("P3:("+p3.x+","+p3.y+")");
        System.out.println("Distance between P1 and P2 is:"+p1.distance(p2.x,p2.y));
        System.out.println("Distance between P2 and P3 is:"+p2.distance(p3));
        System.out.println("Distance between P1 and P3 is:"+p1.distance(p3));
    }

}
