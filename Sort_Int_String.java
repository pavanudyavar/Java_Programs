/*
 Input an array of n1 integers and n2 strings. 
 Sort them using bubble sort method. [Use the concept of method overloading].
 */

package Sort_Int_String;
import java.util.*;
class Sort{
    void sort(int n,int a[])
    {
       int temp,swapped=1,i,j;
       for(i=1;i<n&&swapped==1;i++)
       {
           swapped=0;
           for(j=0;j<=n-i-1;j++)
               if(a[j]>a[j+1])
               {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                   swapped=1;
               }
       }
    }
       void sort(int n,String s[])
    {
       String temp;
       int swapped=1,i,j;
       for(i=1;i<n&&swapped==1;i++)
       {
           swapped=0;
           for(j=0;j<=n-i-1;j++)
               if(s[j].compareToIgnoreCase(s[j+1])>0)
               {
                   temp=s[j];
                   s[j]=s[j+1];
                   s[j+1]=temp;
                   swapped=1;
               }
       }
    }
}
public class Sort_Int_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter number of integers in an array:\n");
        n=s.nextInt();
        int iarr[]=new int[n];
        System.out.println("Enter "+n+"array elements: ");
        for(int i=0;i<n;i++)
            iarr[i]=s.nextInt();
        System.out.println("Entered integer array is: ");
        for(int i=0;i<n;i++)
            System.out.print(iarr[i]+"  ");
        System.out.println();
        Sort isort=new Sort();
        isort.sort(n,iarr);
        System.out.println("Sorted integer array is:");
        for(int i=0;i<n;i++)
            System.out.print(iarr[i]+"  ");
        System.out.println();
        System.out.println("Enter number of strings in an array:\n");
        n=s.nextInt();
        String[] sarr=new String[n];
        System.out.println("Enter "+n+"array elements: ");
        for(int i=0;i<n;i++)
            sarr[i]=s.next();
        System.out.println("Entered string array is: ");
        for(int i=0;i<n;i++)
            System.out.println(sarr[i]);
        System.out.println();
        Sort ssort=new Sort();
        ssort.sort(n,sarr);
        System.out.println("Sorted String array is:");
        for(int i=0;i<n;i++)
            System.out.println(sarr[i]);
    }
    
}
