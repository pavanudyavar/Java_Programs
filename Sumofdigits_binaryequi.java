/*
 Input an integer from the command line.
    * Check whether it is odd or even.
    * Find and display the sum of its digits.
    * Calculate and display its binary equivalent.
 */

/* Author :Pavan Kumar*/

package sumofdigits_binaryequi;

public class Sumofdigits_binaryequi {

    public static void main(String args[])
	{
		int n,rem,sum=0,n1,bn=0,p=1;
		n=Integer.parseInt(args[0]);

                /* Check whether it is odd or even*/
		if(n%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");

                 /* Find and display the sum of its digits*/
		n1=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digit is "+sum);

                /* Calculate and display its binary equivalent*/
		while(n1>0)
		{
			rem=n1%2;
			bn=bn+rem*p;
			n1=n1/2;
			p=p*10;
		}
		System.out.println("The Binary equivalent is "+bn);
	}

}
