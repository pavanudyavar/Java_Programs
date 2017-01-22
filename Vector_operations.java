/*
Collections: Create and initialize a vector with first five odd integers. 
Using a menu, perform the following operations on this vector: [Use separate methods for each operation]
 Insert an element at a specified position
 Insert an element at the end
 Delete an element
 */

package Vector_operations;
import java.util.*;

public class Vector_operations{
    static Scanner s=new Scanner(System.in);
    static void ins_pos(Vector v)
    {
        System.out.println("Enter element to be insert:");
        int el=s.nextInt();
        System.out.println("Enter position to be insert:");
        int pos=s.nextInt();
        v.add(pos-1,el);
        System.out.println(el+" inserted");
    }
    static void ins_last(Vector v)
    {
        System.out.println("Enter element to be append:");
        int el=s.nextInt();
        v.add(el);
        System.out.println(el+" appended");
    }
    static void delete_ele(Vector v)
    {
        System.out.println("Enter element to be delete:");
        int num=s.nextInt();
        boolean rm=v.removeElement(num);
        if(rm==false)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element "+num+" deleted");
        }
    }
    static void display(Vector v)
    {
       System.out.println("Vector:"+v);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Vector v=new Vector(5);
        for(int i=1;i<=5;i++)
        {
            v.addElement(2*i-1);
        }
        while(true)
        {
            System.out.println("\n=======Menu=======\n1.Insert an element at a specified position\n" +
                    "2.Insert an element at the end\n" +"3.Delete an element\n" +"4.Display the contents\n"+"5.Exit");
            int choice;
            System.out.println("Enter your choice:");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:ins_pos(v);
                   break;
                case 2:ins_last(v);
                    break;
                case 3:delete_ele(v);
                    break;
                case 4:display(v);
                    break;
                case 5:return;
            }
        }
    }
    
}
