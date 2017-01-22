/*
 Input two strings (S1 and S2) and two integers (N1 and N2). Perform the following string operations
 [Use separate methods]
 Display the upper-case equivalent of S1.
 Display the lower-case equivalent of S2.
 Extract a substring of length N2 from S1 starting at position N1.
 Insert S2 into S1 at position N1.
 Append S2 to S1.
 */

package String_Operations;

/**
 *
 * @author: Pavan Kumar
 */
import java.util.*;

public class String_Operations {
    static void Dis_Up(String s1)
    {
        System.out.println("Uppercase equivalent of S1 is: "+s1.toUpperCase());
    }
    static void Dis_Low(String s2)
    {
        System.out.println("Lowercase equivalent of S2 is: "+s2.toLowerCase());
    }
    static void Dis_Sub(String s1,int n1,int n2)
    {
        System.out.println("Substring of length N2 from S1 starting at position N1 is: "+s1.substring(n1,n1+n2));
    }
    static void Dis_Ins(String s1,String s2,int n1)
    {
        StringBuffer str1=new StringBuffer(s1);
        str1.insert(n1, s2);
        System.out.println("S1 after Insertion of S2 at position N1: "+str1.toString());
    }
    static void Dis_App(String s1,String s2)
    {
        StringBuffer str1=new StringBuffer(s1);
        str1.append(s2);
        System.out.println("S1 after appending S2: "+str1.toString());
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String s1,s2;
       int n1,n2;
       System.out.println("Enter two strings S1 and S2:");
       s1=s.next();
       s2=s.next();
       System.out.println("Enter two numbers N1 and N2(N1 is pos and N2 is no. of char):");
       n1=s.nextInt();
       n2=s.nextInt();
       Dis_Up(s1);
       Dis_Low(s2);
       Dis_Sub(s1,n1,n2);
       Dis_Ins(s1,s2,n1);
       Dis_App(s1,s2);
    }

}
