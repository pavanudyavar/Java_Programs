/*
 Input two integers, n and r.
    * Evaluate nCr = n! / (r!(n-r)!). [Use recursive function to calculate factorial of an integer].
    * Find the GCD and LCM of these two integers.
 */

package gcd_lcm_ncr;

/**
 * Author:Pavan Kumar
 */
import java.util.*;
public class GCD_LCM_nCr {
    
    static int fact(int n)
	{
		int result;
		if(n==1)
			return 1;
		else
			result=fact(n-1)*n;
		return result;
	}
	public static void main(String args[])
	{
		int gcd,lcm,ncr,rem,n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n and r");
		int n=s.nextInt();
		int r=s.nextInt();
		ncr=fact(n)/(fact(r)*fact(n-r));
		System.out.println(n+"C"+r+"="+ncr);
		/*To find GCD and LCM*/
		n1=n;n2=r;
		while((rem=n1%n2)!=0)
		{
			n1=n2;
			n2=rem;
		}
		gcd=n2;
		System.out.println("GCD="+gcd);
		lcm=(n*r)/gcd;
		System.out.println("LCM="+lcm);
	}
}
