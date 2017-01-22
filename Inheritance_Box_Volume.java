/*
 Create a class called Box having length, width, and height as attributes. 
Use a method along with all possible constructors to calculate volume. 
Create a derived class with additional data members weight and color. 
Include a method to display the volume and all the data members used in both the classes.
 */

package Inheritance_Box_Volume;
import java.util.*;
class Box
{
    double length,height,width;
    Box(double l,double w,double h)
    {
        length=l;
        width=w;
        height=h;
    }
    double Volume()
    {
        return length*width*height;
    }
}
class Box_derived extends Box
{
    double weight;
    String color;
    Box_derived(double l, double w, double h,double wt,String c) {
        super(l, w, h);
        weight=wt;
        color=c;
    }
    void Display()
    {
        System.out.println("Volume of the box: "+Volume());
        System.out.println("Weght of the Box: "+weight+"\nColor of the box: "+color);
    }
}
public class Inheritance_Box_Volume {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length,width,height of Box: ");
        double l=s.nextDouble();
        double w=s.nextDouble();
        double h=s.nextDouble();
        System.out.println("Enter weight and color of the box:");
        double wt=s.nextDouble();
        String col=s.next();
        Box_derived b=new Box_derived(l,w,h,wt,col);
        b.Display();
    }
    
}
