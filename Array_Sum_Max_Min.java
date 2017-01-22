/*
 Input an array of n integers. Calculate and display the following (use enhanced-for loop):
    * Sum of its elements.
    * Minimum and maximum elements in it.
 */

package array_sum_max_min;

/**
 * Author: Pavan Kumar
 */

import java.util.*;
public class Array_Sum_Max_Min {

   public static void main(String args[])
	{
		int arr[],n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		n=s.nextInt();
		System.out.println("Enter "+n+" array elements:");
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int max=arr[0];
		int min=arr[0];
		for(int x:arr)
		{
			sum=sum+x;
			max=Math.max(max,x);
			min=Math.min(min,x);
		}
		System.out.println("Sum of elements is="+sum);
		System.out.println("Max ="+max+"\nMin ="+min);
	}
    
}
