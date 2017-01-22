/*
 Input a string and rearrange the characters in it in alphabetic order
 (E.g., COMPUTER should be written in the form of CEMOPRTU).
 */

package Rearrange_alpha_order;

/**
 * @author: Pavan kumar
 */
import java.util.*;
class Sort{
    String sort(String s)
    {
       StringBuffer st=new StringBuffer(s);
       int swapped=1,i,j,n;
       n=s.length();
       for(i=1;i<n&&swapped==1;i++)
       {
           swapped=0;
           for(j=0;j<=n-i-1;j++)
               if(st.charAt(j)>st.charAt(j+1))
               {
                   char c1=st.charAt(j);
                   char c2=st.charAt(j+1);
                   st.setCharAt(j,c2);
                   st.setCharAt(j+1,c1);
                   swapped=1;
               }
       }
       return st.toString();
    }
}
public class Rearrange_alpha_order {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.next();
        System.out.println("Entered string is:"+str);
        Sort st=new Sort();
        System.out.println("Sorted string is:"+st.sort(str));
    }

}
