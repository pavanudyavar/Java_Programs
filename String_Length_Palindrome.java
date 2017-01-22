/*
 Input a string from the command line.
    * Find its length.
    * Check whether it is a palindrome or not.
    * Count the number of alphabets, digits and other characters in it.
 */

package string_length_palindrome;

/**
 * Author: Pavan Kumar
 */
public class String_Length_Palindrome {

    /*
     * @param args the command line arguments
     */
    public static void main(String args[])
	{
		int i,alpha=0,digit=0,sp=0,n;
		boolean flag=true;
		n=args[0].length()-1;//n is length of a string -1
		System.out.println("Length of a given string is: "+args[0].length());//prints length of a string
		
                //check for palindrome or not
		String s=args[0].toUpperCase();
		for(i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(n--))
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
			System.out.println("Not a palindrome");
		else
			System.out.println("String is a Palindrome");
		
                //count number of alphabets,digits,other characters		
		for(i=0;i<s.length();i++)
		{
			if(Character.isLetter(s.charAt(i)))
				alpha++;
			else if(Character.isDigit(s.charAt(i)))
				digit++;
			else
				sp++;
		}
		System.out.println("Number of digits: "+digit);
		System.out.println("Number of alphabets: "+alpha);
		System.out.println("Number of other characters: "+sp);
	}
}
